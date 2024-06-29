import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kha")
public class class37 extends Exception {
   @OriginalMember(
      owner = "client!kha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field548 = new String[]{method424(method423("Xd\u0007Y_\u001b")), method424(method423("H\"HYg")), method424(method423("]y\n\u001b")), method424(method423("Xd\u0007Y[\u001b")), method424(method423("Xd\u0007YY\u001b")), method424(method423("Xd\u0007YX\u001b")), method424(method423("Xd\u0007Y^\u001b"))};
   @OriginalMember(
      owner = "client!kha",
      name = "f",
      descriptor = "Lom;"
   )
   public static class722 field541 = new class722();
   @OriginalMember(
      owner = "client!kha",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field543 = false;
   @OriginalMember(
      owner = "client!kha",
      name = "h",
      descriptor = "I"
   )
   public static int field539;
   @OriginalMember(
      owner = "client!kha",
      name = "g",
      descriptor = "I"
   )
   public static int field540;
   @OriginalMember(
      owner = "client!kha",
      name = "a",
      descriptor = "I"
   )
   public static int field542;
   @OriginalMember(
      owner = "client!kha",
      name = "b",
      descriptor = "I"
   )
   public static int field544;
   @OriginalMember(
      owner = "client!kha",
      name = "e",
      descriptor = "I"
   )
   public static int field545;
   @OriginalMember(
      owner = "client!kha",
      name = "i",
      descriptor = "I"
   )
   public static int field546;
   @OriginalMember(
      owner = "client!kha",
      name = "d",
      descriptor = "I"
   )
   public static int field547;

   @OriginalMember(
      owner = "client!kha",
      name = "a",
      descriptor = "(B[[I)V"
   )
   public static final void method418(byte arg0, int[][] arg1) {
      try {
         if (arg0 == -82) {
            class788.field11482 = arg1;
            ++field546;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field548[3] + arg0 + ',' + (arg1 != null ? field548[1] : field548[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "a",
      descriptor = "(IIII[BI)V"
   )
   public static final void method419(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
      boolean var6 = client.field10022;

      try {
         ++field539;
         if (~arg5 > ~arg1) {
            arg0 += arg5;
            arg3 = -arg5 + arg1 >> 2;
            if (arg2 == -937127742) {
               while(true) {
                  --arg3;
                  if (arg3 < 0) {
                     arg3 = 3 & -arg5 + arg1;
                     if (!var6) {
                        if (var6) {
                           arg4[arg0++] = 1;
                        }

                        while(true) {
                           --arg3;
                           if (~arg3 > -1) {
                              return;
                           }

                           arg4[arg0++] = 1;
                        }
                     }
                  } else {
                     int var9 = arg0 + 1;
                     arg4[arg0] = 1;
                     int var10 = var9 + 1;
                     arg4[var9] = 1;
                     arg0 = var10 + 1;
                     arg4[var10] = 1;
                  }

                  arg4[arg0++] = 1;
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field548[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field548[1] : field548[2]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "a",
      descriptor = "([BI)[B"
   )
   public static final byte[] method420(byte[] arg0, int arg1) {
      try {
         ++field544;
         int var2 = arg0.length;
         if (arg1 < 9) {
            field547 = 76;
         }

         byte[] var3 = new byte[var2];
         class474.method3640(arg0, 0, var3, 0, var2);
         return var3;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field548[0] + (arg0 != null ? field548[1] : field548[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method421(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kha",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method422(int arg0) {
      try {
         field541 = null;
         if (arg0 != 0) {
            method422(-16);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field548[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method423(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method424(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 51;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 102;
            break;
         case 3:
            var10005 = 119;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
