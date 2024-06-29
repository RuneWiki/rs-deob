import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class126 implements class758 {
   @OriginalMember(
      owner = "client!ak",
      name = "f",
      descriptor = "Lmi;"
   )
   private class20 field2026;
   @OriginalMember(
      owner = "client!ak",
      name = "l",
      descriptor = "I"
   )
   public int field2032;
   @OriginalMember(
      owner = "client!ak",
      name = "n",
      descriptor = "I"
   )
   public int field2023;
   @OriginalMember(
      owner = "client!ak",
      name = "g",
      descriptor = "[I"
   )
   public int[] field2027;
   @OriginalMember(
      owner = "client!ak",
      name = "h",
      descriptor = "Lji;"
   )
   private class609 field2022;
   @OriginalMember(
      owner = "client!ak",
      name = "k",
      descriptor = "[F"
   )
   public float[] field2025;
   @OriginalMember(
      owner = "client!ak",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2034 = new String[]{method1299(method1298("3'>x\u0012<%dzS")), method1299(method1298("<9|(")), method1299(method1298(")b>j\u0006")), method1299(method1298("3'>\u0006S")), method1299(method1298("3'>\u0000S")), method1299(method1298("3'>\u0005S")), method1299(method1298("3'>\u0007S")), method1299(method1298("3'>\u0001S"))};
   @OriginalMember(
      owner = "client!ak",
      name = "c",
      descriptor = "Lhha;"
   )
   public static class724 field2021 = new class724(35, 1);
   @OriginalMember(
      owner = "client!ak",
      name = "b",
      descriptor = "Lhha;"
   )
   public static class724 field2029 = new class724(4, 0);
   @OriginalMember(
      owner = "client!ak",
      name = "a",
      descriptor = "Lfm;"
   )
   public static class164 field2031 = new class164(29, 4);
   @OriginalMember(
      owner = "client!ak",
      name = "i",
      descriptor = "F"
   )
   public static float field2033 = 0.0F;
   @OriginalMember(
      owner = "client!ak",
      name = "j",
      descriptor = "I"
   )
   public static int field2020;
   @OriginalMember(
      owner = "client!ak",
      name = "m",
      descriptor = "I"
   )
   public static int field2024;
   @OriginalMember(
      owner = "client!ak",
      name = "e",
      descriptor = "I"
   )
   public static int field2028;
   @OriginalMember(
      owner = "client!ak",
      name = "d",
      descriptor = "I"
   )
   public static int field2030;

   @OriginalMember(
      owner = "client!ak",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1295(byte arg0) {
      try {
         field2029 = null;
         field2031 = null;
         field2021 = null;
         if (arg0 > -70) {
            field2031 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2034[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method1296(int arg0, int arg1) {
      try {
         ++field2020;
         if (arg1 != 7387) {
            method1295((byte)-35);
         }

         return arg0 == 3 || arg0 == 7 || arg0 == 9 || ~arg0 == -12;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2034[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "a",
      descriptor = "(ILjava/lang/String;)I"
   )
   public static final int method1297(int arg0, String arg1) {
      boolean var2 = client.field10022;

      try {
         ++field2024;
         int var3 = arg1.length();
         int var4 = 0;
         if (arg0 >= -90) {
            field2031 = null;
         }

         int var5 = 0;
         if (var2) {
            var4 = (var4 << 5) + -var4 - -class144.method1430(arg1.charAt(var5), (byte)97);
            ++var5;
         }

         while(true) {
            while(var5 < var3) {
               var4 = (var4 << 5) + -var4 - -class144.method1430(arg1.charAt(var5), (byte)97);
               ++var5;
            }

            if (!var2) {
               return var4;
            }

            var4 = var4;
            ++var5;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field2034[4] + arg0 + ',' + (arg1 != null ? field2034[2] : field2034[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "a",
      descriptor = "(IIIIIIZZ)V"
   )
   public final void method631(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      try {
         class227.method2020(arg4, arg5, (byte)-18, !arg7 ? null : this.field2025, arg3, arg6 ? this.field2026.field274.field8975 : null, this.field2027, arg7 ? this.field2026.field275 : null, arg2, this.field2023, arg0, this.field2026.field274.field8979, arg1);
         ++field2030;
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field2034[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "b",
      descriptor = "(IIIIIIZZ)V"
   )
   public final void method632(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      try {
         class227.method2020(arg4, arg5, (byte)-20, !arg7 ? null : this.field2026.field275, arg3, arg6 ? this.field2027 : null, this.field2026.field274.field8975, !arg7 ? null : this.field2025, arg2, this.field2026.field274.field8979, arg0, this.field2023, arg1);
         ++field2028;
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field2034[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "<init>",
      descriptor = "(Lmi;Lma;Lji;)V"
   )
   public class126(class20 arg0, class148 arg1, class609 arg2) {
      try {
         this.field2026 = arg0;
         if (!(arg1 instanceof class276)) {
            if (!(arg1 instanceof class718)) {
               throw new RuntimeException();
            }

            class718 var4 = (class718)arg1;
            this.field2032 = var4.field4607;
            this.field2023 = var4.field4618;
            this.field2027 = var4.field10287;
            if (client.field10022) {
               throw new RuntimeException();
            }
         } else {
            class276 var5 = (class276)arg1;
            this.field2023 = var5.field4618;
            this.field2032 = var5.field4607;
            this.field2027 = var5.field4184;
         }

         if (arg2 != null) {
            this.field2022 = arg2;
            if (this.field2022.field8671 == this.field2023 && this.field2022.field8673 == this.field2032) {
               this.field2025 = this.field2022.field8672;
            } else {
               throw new RuntimeException();
            }
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field2034[0] + (arg0 != null ? field2034[2] : field2034[1]) + ',' + (arg1 != null ? field2034[2] : field2034[1]) + ',' + (arg2 != null ? field2034[2] : field2034[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ak",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1298(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ak",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1299(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 82;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 16;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
