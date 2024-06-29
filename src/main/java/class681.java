import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vha")
public class class681 {
   @OriginalMember(
      owner = "client!vha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9850 = new String[]{method4978(method4977("C*\\>f\u001d")), method4978(method4977("[7Q|")), method4978(method4977("Nl\u0013>Y")), method4978(method4977("C*\\>g\u001d")), method4978(method4977("C*\\>e\u001d")), method4978(method4977("C*\\>a\u001d")), method4978(method4977("C*\\>`\u001d"))};
   @OriginalMember(
      owner = "client!vha",
      name = "e",
      descriptor = "Lhha;"
   )
   public static class724 field9849 = new class724(83, 0);
   @OriginalMember(
      owner = "client!vha",
      name = "d",
      descriptor = "I"
   )
   public static int field9844;
   @OriginalMember(
      owner = "client!vha",
      name = "c",
      descriptor = "I"
   )
   public static int field9845;
   @OriginalMember(
      owner = "client!vha",
      name = "b",
      descriptor = "I"
   )
   public static int field9846;
   @OriginalMember(
      owner = "client!vha",
      name = "a",
      descriptor = "I"
   )
   public static int field9847;
   @OriginalMember(
      owner = "client!vha",
      name = "f",
      descriptor = "I"
   )
   public static int field9848;

   @OriginalMember(
      owner = "client!vha",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public static final boolean method4972(int arg0, byte arg1, int arg2) {
      try {
         ++field9844;
         if (arg1 != 70) {
            field9849 = null;
         }

         return class361.method2838(arg0, arg2, -1983466679) & class488.method3714(arg1 ^ 71, arg0, arg2);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9850[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vha",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4973(int arg0) {
      try {
         if (arg0 != 4240) {
            field9845 = -99;
         }

         field9849 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9850[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vha",
      name = "a",
      descriptor = "(Lkn;III)V"
   )
   public static final void method4974(class437 arg0, int arg1, int arg2, int arg3) {
      try {
         class341.field5025[arg1][arg3] = arg0;
         ++field9848;
         int var4 = 93 / ((arg2 - -1) / 61);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field9850[0] + (arg0 != null ? field9850[2] : field9850[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vha",
      name = "a",
      descriptor = "(II[B)[B"
   )
   public static final byte[] method4975(int arg0, int arg1, byte[] arg2) {
      try {
         ++field9846;
         if (arg0 >= -104) {
            field9849 = null;
         }

         byte[] var3 = new byte[arg1];
         class474.method3640(arg2, 0, var3, 0, arg1);
         return var3;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field9850[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9850[2] : field9850[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vha",
      name = "a",
      descriptor = "(IIIZ)Lbt;"
   )
   public static final class395 method4976(int arg0, int arg1, int arg2, boolean arg3) {
      boolean var4 = client.field10022;

      try {
         if (arg3) {
            method4975(-67, 64, (byte[])null);
         }

         ++field9847;
         class312 var5 = class324.field4826[arg0][arg2][arg1];
         if (var5 == null) {
            return null;
         } else {
            class395 var6 = null;
            int var7 = -1;
            class84 var8 = var5.field4678;

            while(true) {
               class578 var10000;
               if (var8 == null) {
                  var10000 = var6;
                  if (!var4) {
                     return var6;
                  }
               } else {
                  var10000 = var8.field1299;
               }

               class578 var9 = var10000;
               if (var9 instanceof class395) {
                  class395 var10 = (class395)var9;
                  int var11 = 252 + (var10.method1507(-48) - 1) * 256;
                  int var12 = -var11 + var10.field6832 >> 9;
                  int var13 = var10.field6833 - var11 >> 9;
                  int var14 = var10.field6832 + var11 >> 9;
                  int var15 = var10.field6833 + var11 >> 9;
                  if (var12 <= arg2 && arg1 >= var13 && ~var14 <= ~arg2 && ~arg1 >= ~var15) {
                     int var16 = (var15 - arg1 + 1) * (-arg2 + 1 + var14);
                     if (var7 < var16) {
                        var6 = var10;
                        var7 = var16;
                     }
                  }
               }

               var8 = var8.field1305;
            }
         }
      } catch (RuntimeException var18) {
         throw class612.method4503(var18, field9850[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4977(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4978(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 66;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
