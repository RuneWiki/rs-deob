import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kja")
public abstract class class515 {
   @OriginalMember(
      owner = "client!kja",
      name = "c",
      descriptor = "Laea;"
   )
   public class678 field7307;
   @OriginalMember(
      owner = "client!kja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7311 = new String[]{method3873(method3872("\u00132)g\u000eP")), method3873(method3872("\u00132)g|\u00116!=~P")), method3873(method3872("\u0016-$%")), method3873(method3872("\u0003vfg=")), method3873(method3872("\u00132)g\rP")), method3873(method3872("\u00132)g\u000fP"))};
   @OriginalMember(
      owner = "client!kja",
      name = "b",
      descriptor = "Lhha;"
   )
   public static class724 field7308 = new class724(45, -1);
   @OriginalMember(
      owner = "client!kja",
      name = "d",
      descriptor = "I"
   )
   public static int field7306;
   @OriginalMember(
      owner = "client!kja",
      name = "e",
      descriptor = "I"
   )
   public static int field7309;
   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "I"
   )
   public static int field7310;

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(ILln;I)V"
   )
   public abstract void method131(int arg0, class719 arg1, int arg2);

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(Z)V"
   )
   public abstract void method133(boolean arg0);

   @OriginalMember(
      owner = "client!kja",
      name = "<init>",
      descriptor = "(Laea;)V"
   )
   public class515(class678 arg0) {
      try {
         this.field7307 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7311[1] + (arg0 != null ? field7311[3] : field7311[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(I)Z"
   )
   public abstract boolean method135(int arg0);

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(ZI)V"
   )
   public abstract void method136(boolean arg0, int arg1);

   @OriginalMember(
      owner = "client!kja",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3869(int arg0) {
      try {
         if (arg0 == -5) {
            field7308 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7311[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(IBI)V"
   )
   public abstract void method137(int arg0, byte arg1, int arg2);

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(IIBII)V"
   )
   public static final void method3870(int arg0, int arg1, byte arg2, int arg3, int arg4) {
      boolean var5 = client.field10022;

      try {
         ++field7306;
         if (class217.field3113 == 1) {
            if (arg2 == -50) {
               int var6 = arg4 / class502.field7168;
               int var7 = arg1 / class502.field7168;
               int var8 = arg0 / class466.field6765;
               int var9 = arg3 / class466.field6765;
               if (var6 < class590.field8352 && ~var7 <= -1 && class701.field10102 > var8 && ~var9 <= -1) {
                  if (~class590.field8352 >= ~var7) {
                     var7 = class590.field8352 + -1;
                  }

                  if (~var9 <= ~class701.field10102) {
                     var9 = class701.field10102 + -1;
                  }

                  if (~var8 > -1) {
                     var8 = 0;
                  }

                  if (~var6 > -1) {
                     var6 = 0;
                  }

                  int var10 = var8;
                  if (var5 || var8 <= var9) {
                     do {
                        int var11 = class315.method2562((byte)-118, class701.field10102, class249.field3818 + var10) * class590.field8352;
                        int var12 = var6;
                        if (var5 || var6 <= var7) {
                           do {
                              int var13 = var11 + class315.method2562((byte)-47, class590.field8352, class19.field257 + var12);
                              class614.field8733[var13] = class599.field8520;
                              ++var12;
                           } while(var12 <= var7);
                        }

                        ++var10;
                     } while(var10 <= var9);

                  }
               }
            }
         }
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field7311[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(ILlw;)V"
   )
   public static final void method3871(int param0, class408 param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(IZ)V"
   )
   public abstract void method132(int arg0, boolean arg1);

   @OriginalMember(
      owner = "client!kja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3872(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3873(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 88;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 73;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
