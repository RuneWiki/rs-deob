import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public class class787 extends class557 {
   @OriginalMember(
      owner = "client!eha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11481 = new String[]{method5690(method5689("\u0017y&-gZ")), method5690(method5689("\u0017y&-bZ")), method5690(method5689("\u0017y&-eZ")), method5690(method5689("\u0017y&-`Z")), method5690(method5689("\u0017y&-lZ")), method5690(method5689("\u0017y&-dZ")), method5690(method5689("\u0017y&-nZ")), method5690(method5689("\u0017y&-aZ"))};
   @OriginalMember(
      owner = "client!eha",
      name = "o",
      descriptor = "I"
   )
   public static int field11473;
   @OriginalMember(
      owner = "client!eha",
      name = "n",
      descriptor = "I"
   )
   public static int field11474;
   @OriginalMember(
      owner = "client!eha",
      name = "m",
      descriptor = "I"
   )
   public static int field11475;
   @OriginalMember(
      owner = "client!eha",
      name = "j",
      descriptor = "I"
   )
   public static int field11476;
   @OriginalMember(
      owner = "client!eha",
      name = "l",
      descriptor = "I"
   )
   public static int field11477;
   @OriginalMember(
      owner = "client!eha",
      name = "k",
      descriptor = "I"
   )
   public static int field11479;
   @OriginalMember(
      owner = "client!eha",
      name = "h",
      descriptor = "I"
   )
   public static int field11480;
   @OriginalMember(
      owner = "client!eha",
      name = "i",
      descriptor = "Lee;"
   )
   public static class488 field11478;

   @OriginalMember(
      owner = "client!eha",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method97(int arg0) {
      try {
         ++field11479;
         if (arg0 != 0) {
            field11478 = null;
         }

         return 1;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11481[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eha",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method99(int arg0, boolean arg1) {
      try {
         super.field7905 = arg0;
         if (!arg1) {
            this.method98((byte)35);
         }

         ++field11473;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field11481[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eha",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method92(int arg0, int arg1) {
      try {
         ++field11480;
         if (arg0 != 1) {
            this.method5688(57);
         }

         return super.field7906.method4710(-42) ? 3 : 1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field11481[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eha",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method5685(int arg0) {
      try {
         if (arg0 != 9101) {
            field11478 = null;
         }

         field11478 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field11481[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eha",
      name = "<init>",
      descriptor = "(Loea;)V"
   )
   public class787(class647 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!eha",
      name = "a",
      descriptor = "(ZZII)V"
   )
   public static final void method5686(boolean arg0, boolean arg1, int arg2, int arg3) {
      try {
         ++field11474;
         if (class704.field10127.method3101(-1, (long)arg2) == null) {
            label22: {
               if (!class28.field414) {
                  class456.method3533(65, arg1, arg2);
                  if (!client.field10022) {
                     break label22;
                  }
               }

               class452 var4 = new class452(arg2, new class538(4096, class499.field7100, arg2), arg3, arg1);
               var4.field6590.method4105((byte)110, class653.field9251[class777.field11340]);
               class704.field10127.method3098((long)arg2, var4, -1);
            }
         }

         if (arg0) {
            method5685(-19);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field11481[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eha",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method98(byte arg0) {
      try {
         ++field11477;
         if (arg0 != -22) {
            field11478 = null;
         }

         if (super.field7906.method4710(-128)) {
            super.field7905 = 0;
         }

         if (~super.field7905 != -2 && super.field7905 != 0) {
            super.field7905 = this.method97(0);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11481[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eha",
      name = "<init>",
      descriptor = "(ILoea;)V"
   )
   public class787(int arg0, class647 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!eha",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method5687(byte arg0) {
      try {
         if (arg0 != 108) {
            return false;
         } else {
            ++field11475;
            return !super.field7906.method4710(-24);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11481[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eha",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method5688(int arg0) {
      try {
         if (arg0 > -52) {
            return -115;
         } else {
            ++field11476;
            return super.field7905;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11481[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5689(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5690(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 114;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
