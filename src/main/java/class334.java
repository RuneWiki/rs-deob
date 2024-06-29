import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class334 extends class171 {
   @OriginalMember(
      owner = "client!pr",
      name = "z",
      descriptor = "I"
   )
   private int field4597 = -1;
   @OriginalMember(
      owner = "client!pr",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4599 = new String[]{method2657(method2656("\\\u001a3Ek")), method2657(method2656("WF3(>")), method2657(method2656("B\u001dqj")), method2657(method2656("\\\u001a3Ck")), method2657(method2656("\\\u001a3Gk")), method2657(method2656("\\\u001a3Bk")), method2657(method2656("\\\u001a3@k")), method2657(method2656("\\\u001a3Dk"))};
   @OriginalMember(
      owner = "client!pr",
      name = "q",
      descriptor = "B"
   )
   private byte field4595;
   @OriginalMember(
      owner = "client!pr",
      name = "t",
      descriptor = "I"
   )
   public static int field4588;
   @OriginalMember(
      owner = "client!pr",
      name = "y",
      descriptor = "I"
   )
   public static int field4589;
   @OriginalMember(
      owner = "client!pr",
      name = "A",
      descriptor = "I"
   )
   public static int field4590;
   @OriginalMember(
      owner = "client!pr",
      name = "s",
      descriptor = "I"
   )
   public static int field4591;
   @OriginalMember(
      owner = "client!pr",
      name = "w",
      descriptor = "I"
   )
   private int field4592;
   @OriginalMember(
      owner = "client!pr",
      name = "r",
      descriptor = "I"
   )
   public static int field4594;
   @OriginalMember(
      owner = "client!pr",
      name = "x",
      descriptor = "I"
   )
   public static int field4596;
   @OriginalMember(
      owner = "client!pr",
      name = "v",
      descriptor = "I"
   )
   public static int field4598;
   @OriginalMember(
      owner = "client!pr",
      name = "u",
      descriptor = "Ljava/lang/String;"
   )
   private String field4593;

   @OriginalMember(
      owner = "client!pr",
      name = "a",
      descriptor = "(Lmb;I)I"
   )
   public static final int method2652(class431 arg0, int arg1) {
      boolean var2 = client.field1481;

      try {
         if (arg1 < 70) {
            return -8;
         } else {
            ++field4594;
            int var3 = arg0.method3335(4756, 2);
            int var4;
            if (var3 == 0) {
               var4 = 0;
               if (!var2) {
                  return var4;
               }
            }

            if (~var3 != -2) {
               if (var3 != 2) {
                  var4 = arg0.method3335(4756, 11);
                  if (!var2) {
                     return var4;
                  }
               }

               var4 = arg0.method3335(4756, 8);
               if (!var2) {
                  return var4;
               }
            }

            var4 = arg0.method3335(4756, 5);
            return var4;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field4599[3] + (arg0 != null ? field4599[1] : field4599[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pr",
      name = "a",
      descriptor = "(ILww;ZLjava/lang/String;)Lpu;"
   )
   public static final class601 method2653(int arg0, class339 arg1, boolean arg2, String arg3) {
      boolean var4 = client.field1481;

      try {
         ++field4588;
         int var5 = arg1.method2712(arg3, (byte)65);
         if (var5 == -1) {
            return new class601(0);
         } else {
            int[] var6 = arg1.method2684(arg0 + 21863, var5);
            class601 var7 = new class601(var6.length);
            if (arg0 != -21863) {
               field4590 = -96;
            }

            int var8 = 0;
            int var9 = 0;
            class66 var10;
            int var11;
            int var12;
            int var13;
            class601 var10000;
            if (var4) {
               var10 = new class66(arg1.method2697(var6[var9++], var5, false));
               var11 = var10.method610(arg0 ^ -21785);
               var12 = var10.method603(-2);
               var13 = var10.method640(255);
               if (!arg2) {
                  if (var13 == 1) {
                     --var7.field8865;
                     if (var4) {
                        var7.field8861[var8] = var11;
                        var7.field8863[var8] = var12;
                        ++var8;
                        var10000 = var7;
                     } else {
                        var10000 = var7;
                     }
                  } else {
                     var7.field8861[var8] = var11;
                     var7.field8863[var8] = var12;
                     ++var8;
                     var10000 = var7;
                  }
               } else {
                  var7.field8861[var8] = var11;
                  var7.field8863[var8] = var12;
                  ++var8;
                  var10000 = var7;
               }
            } else {
               var10000 = var7;
            }

            do {
               while(var10000.field8865 > var8) {
                  var10 = new class66(arg1.method2697(var6[var9++], var5, false));
                  var11 = var10.method610(arg0 ^ -21785);
                  var12 = var10.method603(-2);
                  var13 = var10.method640(255);
                  if (!arg2) {
                     if (var13 == 1) {
                        --var7.field8865;
                        if (var4) {
                           var7.field8861[var8] = var11;
                           var7.field8863[var8] = var12;
                           ++var8;
                           var10000 = var7;
                        } else {
                           var10000 = var7;
                        }
                     } else {
                        var7.field8861[var8] = var11;
                        var7.field8863[var8] = var12;
                        ++var8;
                        var10000 = var7;
                     }
                  } else {
                     var7.field8861[var8] = var11;
                     var7.field8863[var8] = var12;
                     ++var8;
                     var10000 = var7;
                  }
               }

               var10000 = var7;
            } while(var4);

            return var7;
         }
      } catch (RuntimeException var15) {
         throw class93.method866(var15, field4599[6] + arg0 + ',' + (arg1 != null ? field4599[1] : field4599[2]) + ',' + arg2 + ',' + (arg3 != null ? field4599[1] : field4599[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pr",
      name = "a",
      descriptor = "(Lfu;I)V"
   )
   public final void method1106(class80 arg0, int arg1) {
      try {
         ++field4589;
         class98 var3 = arg0.field1104[this.field4597];
         var3.field1298 = this.field4595;
         var3.field1299 = this.field4593;
         if (arg1 != -3244) {
            method2655(-79, (byte)-22, 127);
         }

         var3.field1307 = this.field4592;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field4599[0] + (arg0 != null ? field4599[1] : field4599[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pr",
      name = "a",
      descriptor = "(Lgea;B)V"
   )
   public final void method1104(class66 arg0, byte arg1) {
      try {
         this.field4597 = arg0.method603(-2);
         ++field4596;
         this.field4595 = arg0.method628((byte)-12);
         this.field4592 = arg0.method603(-2);
         if (arg1 != -111) {
            field4590 = -24;
         }

         arg0.method660(arg1 + 229);
         this.field4593 = arg0.method606(11856);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field4599[5] + (arg0 != null ? field4599[1] : field4599[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pr",
      name = "a",
      descriptor = "(Lkw;BI)V"
   )
   public static final void method2654(class9 param0, byte param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pr",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public static final boolean method2655(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 != -9) {
            return true;
         } else {
            ++field4591;
            return (arg0 & 32) != 0;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field4599[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2656(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2657(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 44;
            break;
         case 1:
            var10005 = 104;
            break;
         case 2:
            var10005 = 29;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
