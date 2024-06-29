import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class395 {
   @OriginalMember(
      owner = "client!wu",
      name = "a",
      descriptor = "I"
   )
   public int field5705;
   @OriginalMember(
      owner = "client!wu",
      name = "i",
      descriptor = "I"
   )
   public int field5704;
   @OriginalMember(
      owner = "client!wu",
      name = "h",
      descriptor = "I"
   )
   public int field5709;
   @OriginalMember(
      owner = "client!wu",
      name = "c",
      descriptor = "I"
   )
   public int field5708;
   @OriginalMember(
      owner = "client!wu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5712 = new String[]{method2995(method2994("lx>uj")), method2995(method2994("lx>tj")), method2995(method2994("lx>vj")), method2995(method2994("lx>\u000b+udd\tj")), method2995(method2994("lx>C-Hyb^,|%"))};
   @OriginalMember(
      owner = "client!wu",
      name = "b",
      descriptor = "Leg;"
   )
   public static class118 field5707 = new class118(86, 4);
   @OriginalMember(
      owner = "client!wu",
      name = "f",
      descriptor = "I"
   )
   public static int field5703;
   @OriginalMember(
      owner = "client!wu",
      name = "g",
      descriptor = "I"
   )
   public static int field5706;
   @OriginalMember(
      owner = "client!wu",
      name = "d",
      descriptor = "I"
   )
   public static int field5710;
   @OriginalMember(
      owner = "client!wu",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field5711;

   @OriginalMember(
      owner = "client!wu",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 3
   )
   public final String toString() {
      try {
         ++field5706;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5712[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!wu",
      name = "a",
      descriptor = "(III)V",
      line = 13
   )
   public static final void method2991(int arg0, int arg1, int arg2) {
      boolean var3 = client.field4360;

      try {
         ++field5710;
         if (class50.field660 != null) {
            label59: {
               int var4 = class50.field658;
               int var5 = class131.field1670;
               class542.method3901(arg0, arg1, -97);
               if (class614.field9025 != arg2) {
                  if (~class614.field9025 != -2 || class12.field133 != null && class50.field658 == var4 && ~class131.field1670 == ~var5) {
                     break label59;
                  }

                  class12.field133 = new class1[class50.field658 * class131.field1670];
                  int var6 = 0;
                  if (var3) {
                     class12.field133[var6] = class50.field660.method529(class50.field660.method513(class347.field4686, class88.field1146), class50.field660.method498(class347.field4686, class88.field1146));
                     ++var6;
                  }

                  while(true) {
                     while(~var6 > ~class12.field133.length) {
                        class12.field133[var6] = class50.field660.method529(class50.field660.method513(class347.field4686, class88.field1146), class50.field660.method498(class347.field4686, class88.field1146));
                        ++var6;
                     }

                     class489.field7006 = 1;
                     class287.field3964 = new int[class50.field658 * class131.field1670];
                     if (!var3) {
                        if (!var3) {
                           break label59;
                        }
                        break;
                     }

                     ++var6;
                  }
               }

               class106.field1344 = null;
               class106.field1344 = class50.field660.method529(class50.field660.method513(class752.field11122, class790.field11596), class50.field660.method498(class752.field11122, class790.field11596));
            }

            class171.field2384 = true;
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field5712[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wu",
      name = "a",
      descriptor = "(I)V",
      line = 64
   )
   public static void method2992(int arg0) {
      try {
         field5711 = null;
         field5707 = null;
         if (arg0 != 0) {
            field5707 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5712[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wu",
      name = "<init>",
      descriptor = "(IIII)V",
      line = 75
   )
   public class395(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field5705 = arg3;
         this.field5704 = arg1;
         this.field5709 = arg2;
         this.field5708 = arg0;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5712[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wu",
      name = "a",
      descriptor = "(IIZII)V",
      line = 86
   )
   public static final void method2993(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
      try {
         ++field5703;
         if (arg4 == 31821) {
            if (class635.method4596(arg3, arg4 ^ 4884)) {
               class389.method2960(arg0, class547.field7851[arg3], arg1, arg2, (byte)-83, -1);
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5712[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2994(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2995(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 27;
            break;
         case 1:
            var10005 = 13;
            break;
         case 2:
            var10005 = 16;
            break;
         case 3:
            var10005 = 55;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
