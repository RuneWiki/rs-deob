import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class416 {
   @OriginalMember(
      owner = "client!pp",
      name = "f",
      descriptor = "Ltv;"
   )
   private class590 field5852 = new class590(256);
   @OriginalMember(
      owner = "client!pp",
      name = "e",
      descriptor = "Ld;"
   )
   private class160 field5850;
   @OriginalMember(
      owner = "client!pp",
      name = "g",
      descriptor = "Lce;"
   )
   private class327 field5844;
   @OriginalMember(
      owner = "client!pp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5853 = new String[]{method3152(method3151("C{\u0010F9")), method3152(method3151("H%\u0010,l")), method3152(method3151("]~Rn")), method3152(method3151("C{\u0010>x]bJ<9")), method3152(method3151("C{\u0010C9")), method3152(method3151("C{\u0010G9")), method3152(method3151("C{\u0010A9")), method3152(method3151("C{\u0010@9"))};
   @OriginalMember(
      owner = "client!pp",
      name = "b",
      descriptor = "Lqu;"
   )
   public static class105 field5845 = new class105(0, 0);
   @OriginalMember(
      owner = "client!pp",
      name = "h",
      descriptor = "I"
   )
   public static int field5843;
   @OriginalMember(
      owner = "client!pp",
      name = "a",
      descriptor = "I"
   )
   public static int field5846;
   @OriginalMember(
      owner = "client!pp",
      name = "d",
      descriptor = "I"
   )
   public static int field5847;
   @OriginalMember(
      owner = "client!pp",
      name = "j",
      descriptor = "I"
   )
   public static int field5851;
   @OriginalMember(
      owner = "client!pp",
      name = "i",
      descriptor = "Leb;"
   )
   public static class657 field5848;
   @OriginalMember(
      owner = "client!pp",
      name = "c",
      descriptor = "Lbo;"
   )
   public static class763 field5849;

   @OriginalMember(
      owner = "client!pp",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method3146(boolean arg0) {
      try {
         this.field5852.method4245(arg0);
         ++field5847;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5853[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pp",
      name = "a",
      descriptor = "(I)[Lo;"
   )
   public static final class31[] method3147(int arg0) {
      try {
         if (arg0 != -15416) {
            field5848 = null;
         }

         ++field5851;
         return new class31[]{class404.field5693, class795.field11615, class212.field2636, class507.field7032, class750.field10915, class226.field2840, class656.field9174, class698.field10187, class37.field437, class221.field2759, class70.field873, class247.field3105, class413.field5801, class386.field5415, class535.field7316};
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5853[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pp",
      name = "a",
      descriptor = "(II)Lgu;"
   )
   public final class610 method3148(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field5843;
         Object var4 = this.field5852.method4239((long)arg0, arg1 ^ arg1);
         if (var4 != null) {
            return (class610)var4;
         } else if (!this.field5850.method1289((byte)-90, arg0)) {
            return null;
         } else {
            class359 var5;
            class610 var8;
            label58: {
               var5 = this.field5850.method1293(arg0, arg1 ^ 17246);
               int var6 = !var5.field5116 ? this.field5844.field4589 : 64;
               if (var5.field5099 && this.field5844.method583()) {
                  float[] var7 = this.field5850.method1290(0.7F, false, 57, var6, arg0, var6);
                  var8 = this.field5844.method2595(var7, class622.field8682, ~var5.field5106 != -1, -70, var6, var6);
                  if (!var3) {
                     break label58;
                  }
               }

               int[] var9;
               label42: {
                  if (var5.field5113 != 2 && class118.method1003(-32614, var5.field5114)) {
                     var9 = this.field5850.method1292(var6, true, (byte)124, 0.7F, var6, arg0);
                     if (!var3) {
                        break label42;
                     }
                  }

                  var9 = this.field5850.method1291(var6, false, var6, 0.7F, arg0, (byte)63);
               }

               var8 = this.field5844.method2484(var9, var5.field5106 != 0, var6, var6, (byte)2);
            }

            var8.method36(arg1 + 32591, var5.field5108, var5.field5107);
            this.field5852.method4238(120, var8, (long)arg0);
            return var8;
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field5853[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pp",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method3149(byte arg0) {
      try {
         this.field5852.method4234(2, 5);
         if (arg0 >= 22) {
            ++field5846;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5853[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pp",
      name = "<init>",
      descriptor = "(Lce;Ld;)V"
   )
   public class416(class327 arg0, class160 arg1) {
      try {
         this.field5850 = arg1;
         this.field5844 = arg0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5853[3] + (arg0 != null ? field5853[1] : field5853[2]) + ',' + (arg1 != null ? field5853[1] : field5853[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pp",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3150(byte arg0) {
      try {
         field5848 = null;
         field5845 = null;
         if (arg0 == -57) {
            field5849 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5853[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3151(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 17);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3152(char[] arg0) {
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
            var10005 = 11;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 2;
            break;
         default:
            var10005 = 17;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
