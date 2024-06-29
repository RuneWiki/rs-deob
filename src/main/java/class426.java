import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class426 {
   @OriginalMember(
      owner = "client!ga",
      name = "h",
      descriptor = "I"
   )
   private int field6105;
   @OriginalMember(
      owner = "client!ga",
      name = "e",
      descriptor = "[Lsga;"
   )
   private class76[] field6106;
   @OriginalMember(
      owner = "client!ga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6117 = new String[]{method3160(method3159("Y5\\\rd")), method3160(method3159("Ez\\d1")), method3160(method3159("P!\u001e&")), method3160(method3159("Y5\\\u000bd")), method3160(method3159("Y5\\v%P=\u0006td")), method3160(method3159("Y5\\\td")), method3160(method3159("Y5\\\fd")), method3160(method3159("Y5\\\u0002d")), method3160(method3159("Y5\\\u000ed")), method3160(method3159("Y5\\\u000fd")), method3160(method3159("Y5\\\bd"))};
   @OriginalMember(
      owner = "client!ga",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field6114 = new int[3];
   @OriginalMember(
      owner = "client!ga",
      name = "j",
      descriptor = "D"
   )
   public static double field6116;
   @OriginalMember(
      owner = "client!ga",
      name = "d",
      descriptor = "I"
   )
   public static int field6103;
   @OriginalMember(
      owner = "client!ga",
      name = "n",
      descriptor = "I"
   )
   public static int field6107;
   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "I"
   )
   public static int field6108;
   @OriginalMember(
      owner = "client!ga",
      name = "l",
      descriptor = "I"
   )
   public static int field6110;
   @OriginalMember(
      owner = "client!ga",
      name = "b",
      descriptor = "I"
   )
   public static int field6111;
   @OriginalMember(
      owner = "client!ga",
      name = "c",
      descriptor = "I"
   )
   public static int field6113;
   @OriginalMember(
      owner = "client!ga",
      name = "f",
      descriptor = "I"
   )
   public static int field6115;
   @OriginalMember(
      owner = "client!ga",
      name = "m",
      descriptor = "J"
   )
   private long field6112;
   @OriginalMember(
      owner = "client!ga",
      name = "g",
      descriptor = "Lce;"
   )
   public static class327 field6104;
   @OriginalMember(
      owner = "client!ga",
      name = "k",
      descriptor = "Lsga;"
   )
   private class76 field6109;

   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "(JI)Lsga;",
      line = 4
   )
   public final class76 method3151(long arg0, int arg1) {
      boolean var4 = client.field4360;

      try {
         this.field6112 = arg0;
         ++field6110;
         if (arg1 != 7210) {
            return null;
         } else {
            class76 var5 = this.field6106[(int)(arg0 & (long)(this.field6105 - 1))];
            this.field6109 = var5.field950;
            class76 var6;
            if (var4) {
               if (~this.field6109.field947 == ~arg0) {
                  var6 = this.field6109;
                  this.field6109 = this.field6109.field950;
                  return var6;
               }

               this.field6109 = this.field6109.field950;
            }

            while(true) {
               while(this.field6109 != var5) {
                  if (~this.field6109.field947 == ~arg0) {
                     var6 = this.field6109;
                     this.field6109 = this.field6109.field950;
                     return var6;
                  }

                  this.field6109 = this.field6109.field950;
               }

               this.field6109 = null;
               if (!var4) {
                  return null;
               }

               this.field6109 = this.field6109.field950;
            }
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field6117[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "(I[III[I)V",
      line = 35
   )
   public static final void method3152(int arg0, int[] arg1, int arg2, int arg3, int[] arg4) {
      boolean var5 = client.field4360;

      try {
         if (arg2 > arg0) {
            int var6 = (arg0 - -arg2) / 2;
            int var7 = arg0;
            int var8 = arg1[var6];
            arg1[var6] = arg1[arg2];
            arg1[arg2] = var8;
            int var9 = arg4[var6];
            arg4[var6] = arg4[arg2];
            arg4[arg2] = var9;
            int var10 = ~var8 == Integer.MIN_VALUE ? 0 : 1;
            int var11 = arg0;
            int var12;
            int var13;
            if (var5) {
               if (~((var10 & arg0) + var8) < ~arg1[arg0]) {
                  var12 = arg1[arg0];
                  arg1[arg0] = arg1[arg0];
                  arg1[arg0] = var12;
                  var13 = arg4[arg0];
                  arg4[arg0] = arg4[arg0];
                  var7 = arg0 + 1;
                  arg4[arg0] = var13;
               }

               var11 = arg0 + 1;
            }

            while(true) {
               int var10000;
               int[] var10001;
               int var10002;
               if (var11 >= arg2) {
                  arg1[arg2] = arg1[var7];
                  arg1[var7] = var8;
                  arg4[arg2] = arg4[var7];
                  arg4[var7] = var9;
                  method3152(arg0, arg1, var7 + -1, 1, arg4);
                  var10000 = var7 + 1;
                  var10001 = arg1;
                  var10002 = arg2;
                  if (!var5) {
                     method3152(var10000, arg1, arg2, 1, arg4);
                     break;
                  }
               } else {
                  var10000 = ~((var10 & var11) + var8);
                  var10001 = arg1;
                  var10002 = var11;
               }

               if (var10000 < ~var10001[var10002]) {
                  var12 = arg1[var11];
                  arg1[var11] = arg1[var7];
                  arg1[var7] = var12;
                  var13 = arg4[var11];
                  arg4[var11] = arg4[var7];
                  arg4[var7++] = var13;
               }

               ++var11;
            }
         }

         if (arg3 == 1) {
            ++field6111;
         }
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field6117[10] + arg0 + ',' + (arg1 != null ? field6117[1] : field6117[2]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field6117[1] : field6117[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "(Lsga;IJ)V",
      line = 97
   )
   public final void method3153(class76 arg0, int arg1, long arg2) {
      try {
         if (arg0.field946 != null) {
            arg0.method693((byte)-14);
         }

         ++field6115;
         class76 var5 = this.field6106[(int)((long)(this.field6105 + -1) & arg2)];
         arg0.field946 = var5.field946;
         arg0.field950 = var5;
         arg0.field946.field950 = arg0;
         arg0.field947 = arg2;
         int var6 = 98 % ((80 - arg1) / 41);
         arg0.field950.field946 = arg0;
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field6117[6] + (arg0 != null ? field6117[1] : field6117[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "(IIIBLcl;II)V",
      line = 118
   )
   public static final void method3154(int arg0, int arg1, int arg2, byte arg3, class279 arg4, int arg5, int arg6) {
      try {
         class92.method797(arg4.field10701, false, arg2, 0, arg5, arg4.field10693, arg0, arg1, arg6, arg4.field10694);
         if (arg3 >= -63) {
            method3158((byte)33);
         }

         ++field6107;
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field6117[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field6117[1] : field6117[2]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "(ZI)Z",
      line = 129
   )
   public static final boolean method3155(boolean arg0, int arg1) {
      try {
         if (!arg0) {
            method3152(48, (int[])null, -73, -3, (int[])null);
         }

         ++field6108;
         return ~arg1 == -8 || ~arg1 == -9 || arg1 == 9 || arg1 == 10;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6117[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "(I)Lsga;",
      line = 144
   )
   public final class76 method3156(int arg0) {
      boolean var2 = client.field4360;

      try {
         ++field6113;
         if (this.field6109 == null) {
            return null;
         } else {
            class76 var3 = this.field6106[(int)(this.field6112 & (long)(this.field6105 - 1))];
            class76 var4;
            if (arg0 != 21291) {
               this.method3151(-6L, 71);
               if (var2) {
                  if (this.field6109.field947 == this.field6112) {
                     var4 = this.field6109;
                     this.field6109 = this.field6109.field950;
                     return var4;
                  }

                  this.field6109 = this.field6109.field950;
               }
            }

            while(true) {
               while(this.field6109 != var3) {
                  if (this.field6109.field947 == this.field6112) {
                     var4 = this.field6109;
                     this.field6109 = this.field6109.field950;
                     return var4;
                  }

                  this.field6109 = this.field6109.field950;
               }

               this.field6109 = null;
               if (!var2) {
                  return null;
               }

               this.field6109 = this.field6109.field950;
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field6117[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "(IIILha;)V",
      line = 176
   )
   public static final void method3157(int arg0, int arg1, int arg2, class66 arg3) {
      try {
         class342.field4643 = new class483[arg1][arg2];
         if (arg0 != 5174) {
            field6104 = null;
         }

         class274.field3758 = arg3;
         ++field6103;
         if (class744.field10852 != null) {
            class749.field11082 = class447.method3280(class744.field10852[4], class744.field10852[0], class744.field10852[2], (byte)-5, class744.field10852[1], class744.field10852[5], class744.field10852[3]);
         }

         class11.field121 = new class483();
         class366.method2730((byte)41);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field6117[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6117[1] : field6117[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "<init>",
      descriptor = "(I)V",
      line = 208
   )
   public class426(int arg0) {
      try {
         this.field6105 = arg0;
         this.field6106 = new class76[arg0];

         for(int var2 = 0; arg0 > var2; ++var2) {
            class76 var3 = this.field6106[var2] = new class76();
            var3.field946 = var3;
            var3.field950 = var3;
         }

      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field6117[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "(B)V",
      line = 230
   )
   public static void method3158(byte arg0) {
      try {
         if (arg0 != -90) {
            field6116 = 0.08375292291384659D;
         }

         field6114 = null;
         field6104 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6117[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3159(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3160(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 62;
            break;
         case 1:
            var10005 = 84;
            break;
         case 2:
            var10005 = 114;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
