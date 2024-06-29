import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class257 extends class723 {
   @OriginalMember(
      owner = "client!dea",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3489 = new String[]{method1951(method1950("G\u000eKm\u0018\u000b")), method1951(method1950("G\u000eKm\u001f\u000b")), method1951(method1950("G\u000eKm\u001b\u000b")), method1951(method1950("G\u000eKm\u001c\u000b")), method1951(method1950("G\u000eKm\u001d\u000b")), method1951(method1950("G\u000eKm\u0019\u000b")), method1951(method1950("G\u000eKm\u001a\u000b"))};
   @OriginalMember(
      owner = "client!dea",
      name = "z",
      descriptor = "Lsda;"
   )
   public static class269 field3484 = new class269(51, -1);
   @OriginalMember(
      owner = "client!dea",
      name = "D",
      descriptor = "Lum;"
   )
   public static class550 field3487 = new class550();
   @OriginalMember(
      owner = "client!dea",
      name = "F",
      descriptor = "I"
   )
   public static int field3479;
   @OriginalMember(
      owner = "client!dea",
      name = "E",
      descriptor = "I"
   )
   public static int field3480;
   @OriginalMember(
      owner = "client!dea",
      name = "C",
      descriptor = "I"
   )
   public static int field3481;
   @OriginalMember(
      owner = "client!dea",
      name = "J",
      descriptor = "I"
   )
   public static int field3483;
   @OriginalMember(
      owner = "client!dea",
      name = "B",
      descriptor = "I"
   )
   public static int field3485;
   @OriginalMember(
      owner = "client!dea",
      name = "G",
      descriptor = "I"
   )
   public static int field3488;
   @OriginalMember(
      owner = "client!dea",
      name = "H",
      descriptor = "Lfa;"
   )
   public static class244 field3482;
   @OriginalMember(
      owner = "client!dea",
      name = "I",
      descriptor = "[B"
   )
   private byte[] field3486;

   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "(BIB)V"
   )
   public final void method1943(byte arg0, int arg1, byte arg2) {
      try {
         ++field3481;
         int var4 = 125 / ((-77 - arg0) / 37);
         int var5 = arg1 * 2;
         byte var8 = (byte)(((arg2 & 255) >> 1) + 127);
         int var10001 = var5;
         int var9 = var5 + 1;
         this.field3486[var10001] = var8;
         this.field3486[var9] = var8;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field3489[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "(CZ)Z"
   )
   public static final boolean method1944(char arg0, boolean arg1) {
      int var2 = client.field4530;

      try {
         ++field3483;
         if (arg0 > 0 && ~arg0 > -129 || ~arg0 <= -161 && ~arg0 >= -256) {
            return true;
         } else {
            if (arg1) {
               method1949(-114);
            }

            if (arg0 != 0) {
               char[] var3 = class777.field11352;
               int var4 = 0;
               if (var2 != 0 || var3.length > var4) {
                  do {
                     char var5 = var3[var4];
                     if (arg0 == var5) {
                        return true;
                     }

                     ++var4;
                  } while(var3.length > var4);
               }
            }

            return false;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field3489[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method1945(int arg0, int arg1) {
      try {
         if (arg1 == 0) {
            ++field3480;
            class403 var2 = class453.method3410((long)arg0, true, 8);
            var2.method3096((byte)-41);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field3489[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "b",
      descriptor = "(IIB)Z"
   )
   public static final boolean method1946(int arg0, int arg1, byte arg2) {
      try {
         ++field3485;
         if (arg2 != -115) {
            field3482 = null;
         }

         return class498.method3713(arg1, -115, arg0) || class672.method4895(-18045, arg0, arg1);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field3489[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "<init>",
      descriptor = "()V"
   )
   public class257() {
      super(12, 5, 16, 2, 2, 0.45F);
   }

   @OriginalMember(
      owner = "client!dea",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method1947(int arg0, int arg1) {
      try {
         if (class226.field2902 == null || ~class226.field2902.length > ~arg1) {
            class226.field2902 = new int[arg1];
         }

         if (arg0 > -16) {
            method1949(21);
         }

         ++field3488;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3489[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "b",
      descriptor = "(IIII)[B"
   )
   public final byte[] method1948(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg3 > -124) {
            method1949(-30);
         }

         this.field3486 = new byte[arg0 * arg2 * arg1 * 2];
         ++field3479;
         this.method3429(arg0, arg2, arg1, 26264);
         return this.field3486;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field3489[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method1949(int arg0) {
      try {
         field3482 = null;
         field3487 = null;
         if (arg0 != 11148) {
            method1944((char)65516, false);
         }

         field3484 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3489[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1950(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 94);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1951(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 67;
            break;
         default:
            var10005 = 94;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
