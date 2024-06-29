import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class605 extends class161 {
   @OriginalMember(
      owner = "client!paa",
      name = "p",
      descriptor = "[I"
   )
   private int[] field8633;
   @OriginalMember(
      owner = "client!paa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8634 = new String[]{method4462(method4461("\u0015'R\u0019\u0017\f(ZC\u0015M")), method4462(method4461("\u000b3_[")), method4462(method4461("\u0015'R\u0019jM")), method4462(method4461("\u001eh\u001d\u0019V")), method4462(method4461("\u0015'R\u0019iM")), method4462(method4461("\u0015'R\u0019hM")), method4462(method4461("\u0015'R\u0019oM")), method4462(method4461("\u0015'R\u0019lM")), method4462(method4461("\u0015'R\u0019mM")), method4462(method4461("\u0015'R\u0019cM")), method4462(method4461("\u0015'R\u0019nM"))};
   @OriginalMember(
      owner = "client!paa",
      name = "v",
      descriptor = "Liw;"
   )
   public static class107 field8625 = new class107(4);
   @OriginalMember(
      owner = "client!paa",
      name = "x",
      descriptor = "I"
   )
   private int field8623;
   @OriginalMember(
      owner = "client!paa",
      name = "t",
      descriptor = "I"
   )
   public static int field8624;
   @OriginalMember(
      owner = "client!paa",
      name = "r",
      descriptor = "I"
   )
   private int field8626;
   @OriginalMember(
      owner = "client!paa",
      name = "q",
      descriptor = "I"
   )
   public static int field8627;
   @OriginalMember(
      owner = "client!paa",
      name = "w",
      descriptor = "I"
   )
   public static int field8628;
   @OriginalMember(
      owner = "client!paa",
      name = "u",
      descriptor = "I"
   )
   public static int field8629;
   @OriginalMember(
      owner = "client!paa",
      name = "m",
      descriptor = "I"
   )
   public static int field8630;
   @OriginalMember(
      owner = "client!paa",
      name = "o",
      descriptor = "I"
   )
   public static int field8631;
   @OriginalMember(
      owner = "client!paa",
      name = "n",
      descriptor = "I"
   )
   public static int field8632;
   @OriginalMember(
      owner = "client!paa",
      name = "s",
      descriptor = "[B"
   )
   private byte[] field8622;

   @OriginalMember(
      owner = "client!paa",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method4457(int arg0, int arg1) {
      try {
         ++field8629;
         class111 var2 = class796.method5734(arg1, (long)arg0, (byte)-127);
         var2.method1083(-14);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8634[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method1520(boolean arg0) {
      try {
         ++field8624;
         this.field8626 = 0;
         this.field8623 = 0;
         if (arg0) {
            method4458(-35, -21);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8634[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "a",
      descriptor = "(BII)V"
   )
   public void method957(byte arg0, int arg1, int arg2) {
      try {
         ++field8631;
         this.field8622[this.field8626++] = (byte)(127 + (class697.method5101(arg1, arg0) >> 1));
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field8634[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method1517(int arg0) {
      try {
         this.field8623 = Math.abs(this.field8623);
         if (arg0 != -164086452) {
            this.field8623 = 13;
         }

         ++field8627;
         if (this.field8623 >= 4096) {
            this.field8623 = 4095;
         }

         this.method957((byte)(this.field8623 >> 4), 255, this.field8626++);
         this.field8623 = 0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8634[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "a",
      descriptor = "(ZII)V"
   )
   public final void method1519(boolean arg0, int arg1, int arg2) {
      try {
         ++field8632;
         this.field8623 += this.field8633[arg1] * arg2 >> 12;
         if (!arg0) {
            this.method1517(-125);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field8634[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "b",
      descriptor = "(II)Lie;"
   )
   public static final class639 method4458(int arg0, int arg1) {
      try {
         ++field8630;
         if (class695.field10045 && ~class7.field134 >= ~arg0 && class367.field5428 >= arg0) {
            if (arg1 != -28137) {
               method4457(-63, -19);
            }

            return class492.field7017[-class7.field134 + arg0];
         } else {
            return null;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8634[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "<init>",
      descriptor = "(IIIIIF)V"
   )
   public class605(int param1, int param2, int param3, int param4, int param5, float param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!paa",
      name = "d",
      descriptor = "(Z)V"
   )
   public static void method4459(boolean arg0) {
      try {
         if (arg0) {
            method4459(true);
         }

         field8625 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8634[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "a",
      descriptor = "(ZLtea;)I"
   )
   public static final int method4460(boolean arg0, class272 arg1) {
      try {
         ++field8628;
         if (!arg0) {
            return 95;
         } else {
            String var2 = class327.method2622(-8744, arg1);
            int[] var3 = null;
            if (class536.method3997(115, arg1.field4159)) {
               var3 = class201.field2882.method5591((int)arg1.field4166, (byte)-84).field8845;
            } else if (~arg1.field4161 != 0) {
               var3 = class201.field2882.method5591(arg1.field4161, (byte)-84).field8845;
            } else if (class220.method1904(0, arg1.field4159)) {
               class432 var4 = (class432)class573.field8110.method3101(-1, (long)((int)arg1.field4166));
               if (var4 != null) {
                  class799 var5 = var4.field6345;
                  class302 var6 = var5.field11618;
                  if (var6.field4550 != null) {
                     var6 = var6.method2501(class344.field5074, 76);
                  }

                  if (var6 != null) {
                     var3 = var6.field4568;
                  }
               }
            } else if (class77.method849(116, arg1.field4159)) {
               class544 var7 = class549.field7834.method3850(3917, (int)(arg1.field4166 >>> 32 & 2147483647L));
               if (var7.field7741 != null) {
                  var7 = var7.method4068(-24716, class344.field5074);
               }

               if (var7 != null) {
                  var3 = var7.field7722;
               }
            }

            if (var3 != null) {
               var2 = var2 + class142.method1418(var3, (byte)101);
            }

            int var8 = class705.field10143.method3429(105, class134.field2183, var2);
            if (arg1.field4157) {
               var8 += class666.field9376.method1350() + 4;
            }

            return var8;
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field8634[2] + arg0 + ',' + (arg1 != null ? field8634[3] : field8634[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4461(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 43);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!paa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4462(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 51;
            break;
         case 3:
            var10005 = 55;
            break;
         default:
            var10005 = 43;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
