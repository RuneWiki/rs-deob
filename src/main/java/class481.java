import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class481 {
   @OriginalMember(
      owner = "client!iga",
      name = "f",
      descriptor = "Lck;"
   )
   private class667 field7145;
   @OriginalMember(
      owner = "client!iga",
      name = "a",
      descriptor = "J"
   )
   public long field7141;
   @OriginalMember(
      owner = "client!iga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7149 = new String[]{method3574(method3573("0_pY")), method3574(method3573("%\u00042\u001b5")), method3574(method3573("7M}\u001bt7DuAvv")), method3574(method3573("7M}\u001b\nv")), method3574(method3573("7M}\u001b.7D}Y!$O4")), method3574(method3573("7M}\u001b\fv")), method3574(method3573("7M}\u001b\tv")), method3574(method3573("7M}\u001b\u000bv"))};
   @OriginalMember(
      owner = "client!iga",
      name = "e",
      descriptor = "Lsda;"
   )
   public static class269 field7142 = new class269(39, -1);
   @OriginalMember(
      owner = "client!iga",
      name = "b",
      descriptor = "Lsda;"
   )
   public static class269 field7148 = new class269(78, -1);
   @OriginalMember(
      owner = "client!iga",
      name = "c",
      descriptor = "I"
   )
   public static int field7140;
   @OriginalMember(
      owner = "client!iga",
      name = "d",
      descriptor = "I"
   )
   public static int field7143;
   @OriginalMember(
      owner = "client!iga",
      name = "h",
      descriptor = "I"
   )
   public static int field7146;
   @OriginalMember(
      owner = "client!iga",
      name = "i",
      descriptor = "I"
   )
   public static int field7147;
   @OriginalMember(
      owner = "client!iga",
      name = "g",
      descriptor = "Lnj;"
   )
   public static class256 field7144;

   @OriginalMember(
      owner = "client!iga",
      name = "finalize",
      descriptor = "()V",
      line = 4
   )
   protected final void finalize() throws Throwable {
      try {
         ++field7146;
         this.field7145.method4832((byte)-114, this.field7141);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7149[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "a",
      descriptor = "(Z)V",
      line = 13
   )
   public static void method3569(boolean arg0) {
      try {
         if (arg0) {
            method3571('i', -4);
         }

         field7142 = null;
         field7148 = null;
         field7144 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7149[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "a",
      descriptor = "(Lld;B)[I",
      line = 27
   )
   public static final int[] method3570(class180 arg0, byte arg1) {
      int var2 = client.field4530;

      try {
         ++field7140;
         class128 var3 = new class128(518);
         int[] var4 = new int[4];
         if (arg1 != 85) {
            field7142 = null;
         }

         int var5 = 0;
         if (var2 != 0) {
            var4[var5] = (int)(9.9999999E7D * Math.random());
            ++var5;
         }

         while(true) {
            while(~var5 > -5) {
               var4[var5] = (int)(9.9999999E7D * Math.random());
               ++var5;
            }

            var3.method1085(10, (byte)-11);
            var3.method1094(-65, var4[0]);
            var3.method1094(-83, var4[1]);
            var3.method1094(-32, var4[2]);
            var3.method1094(-31, var4[3]);
            int var6 = 0;
            if (var2 == 0) {
               if (var2 != 0) {
                  var3.method1094(-67, (int)(Math.random() * 9.9999999E7D));
                  ++var6;
               }

               while(true) {
                  while(~var6 > -11) {
                     var3.method1094(-67, (int)(Math.random() * 9.9999999E7D));
                     ++var6;
                  }

                  var3.method1103((int)(Math.random() * 9.9999999E7D), -74);
                  var3.method1040(class791.field11486, class447.field6799, (byte)-106);
                  arg0.field2211.method1059(var3.field1590, arg1 ^ -2125022363, var3.field1552, 0);
                  if (var2 == 0) {
                     return var4;
                  }

                  ++var6;
               }
            }

            ++var5;
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field7149[6] + (arg0 != null ? field7149[1] : field7149[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "a",
      descriptor = "(CI)Z",
      line = 64
   )
   public static final boolean method3571(char arg0, int arg1) {
      try {
         ++field7147;
         if (arg1 != 376) {
            method3572(-51);
         }

         if (~arg0 <= -33 && ~arg0 >= -127) {
            return true;
         } else if (arg0 >= 160 && ~arg0 >= -256) {
            return true;
         } else {
            return ~arg0 == -8365 || arg0 == 338 || ~arg0 == -8213 || arg0 == 339 || arg0 == 376;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7149[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "a",
      descriptor = "(I)I",
      line = 90
   )
   public static final int method3572(int arg0) {
      try {
         ++field7143;
         int var1 = class541.field7892.method1382((byte)-116);
         if (~var1 > ~(class302.field4311.length + arg0)) {
            class541.field7892 = class302.field4311[var1 - -1];
         }

         return 100;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7149[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "<init>",
      descriptor = "(Lck;JI)V",
      line = 112
   )
   public class481(class667 arg0, long arg1, int arg2) {
      try {
         this.field7145 = arg0;
         this.field7141 = arg1;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field7149[2] + (arg0 != null ? field7149[1] : field7149[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3573(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 72);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3574(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 42;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 72;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
