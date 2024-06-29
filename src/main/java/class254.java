import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public class class254 {
   @OriginalMember(
      owner = "client!eia",
      name = "k",
      descriptor = "Z"
   )
   public boolean field3231;
   @OriginalMember(
      owner = "client!eia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3237 = new String[]{method1936(method1935("*\\h\u001eXg")), method1936(method1935("*\\h\u001eYg")), method1936(method1935("*\\h\u001e_g")), method1936(method1935("*\\h\u001e'&[`D%g")), method1936(method1935("*\\h\u001eZg"))};
   @OriginalMember(
      owner = "client!eia",
      name = "g",
      descriptor = "Lbga;"
   )
   public static class378 field3230 = new class378(105, 4);
   @OriginalMember(
      owner = "client!eia",
      name = "h",
      descriptor = "Lnw;"
   )
   public static class616 field3233 = new class616(43, 3);
   @OriginalMember(
      owner = "client!eia",
      name = "b",
      descriptor = "I"
   )
   public static int field3227;
   @OriginalMember(
      owner = "client!eia",
      name = "a",
      descriptor = "I"
   )
   public static int field3228;
   @OriginalMember(
      owner = "client!eia",
      name = "c",
      descriptor = "I"
   )
   public static int field3232;
   @OriginalMember(
      owner = "client!eia",
      name = "j",
      descriptor = "I"
   )
   public static int field3234;
   @OriginalMember(
      owner = "client!eia",
      name = "i",
      descriptor = "I"
   )
   public static int field3235;
   @OriginalMember(
      owner = "client!eia",
      name = "d",
      descriptor = "Lso;"
   )
   public class499 field3226;
   @OriginalMember(
      owner = "client!eia",
      name = "f",
      descriptor = "Lso;"
   )
   public class499 field3236;
   @OriginalMember(
      owner = "client!eia",
      name = "e",
      descriptor = "Z"
   )
   public boolean field3229;

   @OriginalMember(
      owner = "client!eia",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method1931(boolean arg0) {
      try {
         if (this.field3236 != null) {
            this.field3236.method788((byte)69);
         }

         ++field3232;
         this.field3229 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3237[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method1932(byte arg0) {
      try {
         ++field3234;
         if (arg0 != -100) {
            return false;
         } else {
            return this.field3229 && !this.field3231;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3237[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public static final void method1933(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         int var8;
         label31: {
            ++field3228;
            var8 = arg2 + -334;
            if (var8 >= 0) {
               if (~var8 >= -101) {
                  break label31;
               }

               var8 = 100;
               if (!client.field4273) {
                  break label31;
               }
            }

            var8 = 0;
         }

         int var9 = (class162.field2042 - class90.field1147) * var8 / 100 + class90.field1147;
         if (arg7 != 3) {
            method1934(107);
         }

         class334.field4784 = class334.field4788 * var9 >> 8;
         int var17 = arg1 * var9 >> 8;
         int var10 = -arg0 + 16384 & 16383;
         int var11 = -arg6 + 16384 & 16383;
         int var12 = 0;
         int var13 = 0;
         int var14 = var17;
         if (var10 != 0) {
            var13 = class192.field2342[var10] * -var17 >> 14;
            var14 = class192.field2341[var10] * var17 >> 14;
         }

         if (~var11 != -1) {
            var12 = class192.field2342[var11] * var14 >> 14;
            var14 = class192.field2341[var11] * var14 >> 14;
         }

         class171.field2144 = arg0;
         class331.field4733 = -var13 + arg5;
         class749.field10899 = arg6;
         class737.field10747 = arg4 - var12;
         class191.field2317 = 0;
         class532.field7284 = -var14 + arg3;
      } catch (RuntimeException var16) {
         throw class534.method3846(var16, field3237[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1934(int arg0) {
      try {
         field3233 = null;
         field3230 = null;
         if (arg0 != -1530502200) {
            field3235 = 98;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3237[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "<init>",
      descriptor = "(Z)V"
   )
   public class254(boolean arg0) {
      try {
         this.field3231 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3237[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1935(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 27);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1936(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 53;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 48;
            break;
         default:
            var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
