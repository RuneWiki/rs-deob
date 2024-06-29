import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class171 {
   @OriginalMember(
      owner = "client!ef",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2569 = new String[]{method1592(method1591("LrguSz`;hRN<")), method1592(method1591("R:g/A")), method1592(method1591("LrgE\u0014")), method1592(method1591("Ga%m")), method1592(method1591("LrgC\u0014")), method1592(method1591("Lrg@\u0014")), method1592(method1591("LrgB\u0014"))};
   @OriginalMember(
      owner = "client!ef",
      name = "c",
      descriptor = "Lsr;"
   )
   public static class78 field2564 = new class78(1);
   @OriginalMember(
      owner = "client!ef",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field2567 = new int[2];
   @OriginalMember(
      owner = "client!ef",
      name = "d",
      descriptor = "I"
   )
   public static int field2568 = 0;
   @OriginalMember(
      owner = "client!ef",
      name = "e",
      descriptor = "I"
   )
   public static int field2562;
   @OriginalMember(
      owner = "client!ef",
      name = "f",
      descriptor = "I"
   )
   public static int field2563;
   @OriginalMember(
      owner = "client!ef",
      name = "b",
      descriptor = "I"
   )
   public static int field2565;
   @OriginalMember(
      owner = "client!ef",
      name = "g",
      descriptor = "I"
   )
   public static int field2566;

   @OriginalMember(
      owner = "client!ef",
      name = "a",
      descriptor = "(II)Ljava/lang/String;"
   )
   public static final String method1587(int arg0, int arg1) {
      try {
         if (arg0 != 10) {
            method1588((class381)null, 1);
         }

         ++field2562;
         class452 var2 = (class452)class704.field10127.method3101(arg0 ^ -11, (long)arg1);
         if (var2 != null) {
            class75 var3 = var2.field6590.method4103(-18992);
            if (var3 != null) {
               double var4 = var2.field6590.method4110(21090);
               if ((double)var3.method834((byte)127) <= var4 && var4 <= (double)var3.method835(19)) {
                  return var3.method831(-37);
               }
            }
         }

         return null;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field2569[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "a",
      descriptor = "(Lrb;I)[I"
   )
   public static final int[] method1588(class381 arg0, int arg1) {
      boolean var2 = client.field10022;

      try {
         ++field2566;
         class65 var3 = new class65(518);
         int[] var4 = new int[4];
         if (arg1 != 2041) {
            return null;
         } else {
            int var5 = 0;
            if (var2) {
               var4[var5] = (int)(Math.random() * 9.9999999E7D);
               ++var5;
            }

            while(true) {
               while(~var5 > -5) {
                  var4[var5] = (int)(Math.random() * 9.9999999E7D);
                  ++var5;
               }

               var3.method656((byte)-122, 10);
               var3.method674(-48, var4[0]);
               var3.method674(-124, var4[1]);
               var3.method674(-41, var4[2]);
               var3.method674(-55, var4[3]);
               int var6 = 0;
               if (!var2) {
                  if (var2) {
                     var3.method674(-95, (int)(Math.random() * 9.9999999E7D));
                     ++var6;
                  }

                  while(true) {
                     while(~var6 > -11) {
                        var3.method674(-95, (int)(Math.random() * 9.9999999E7D));
                        ++var6;
                     }

                     var3.method653((int)(Math.random() * 9.9999999E7D), arg1 + -2136);
                     var3.method662(false, class719.field10294, class702.field10115);
                     arg0.field5570.method694(0, var3.field945, var3.field942, -7033);
                     if (!var2) {
                        return var4;
                     }

                     ++var6;
                  }
               }

               ++var5;
            }
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field2569[4] + (arg0 != null ? field2569[1] : field2569[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1589(byte arg0) {
      try {
         field2564 = null;
         int var1 = -128 / ((arg0 - -50) / 35);
         field2567 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2569[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field2565;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2569[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "a",
      descriptor = "(ILig;Lig;)V"
   )
   public static final void method1590(int arg0, class686 arg1, class686 arg2) {
      try {
         ++field2563;
         if (arg2.field9899 != null) {
            arg2.method4994((byte)-101);
         }

         if (arg0 == 0) {
            arg2.field9899 = arg1.field9899;
            arg2.field9903 = arg1;
            arg2.field9899.field9903 = arg2;
            arg2.field9903.field9899 = arg2;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2569[2] + arg0 + ',' + (arg1 != null ? field2569[1] : field2569[3]) + ',' + (arg2 != null ? field2569[1] : field2569[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ef",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1591(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ef",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1592(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 41;
            break;
         case 1:
            var10005 = 20;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
