import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class627 implements Runnable {
   @OriginalMember(
      owner = "client!qs",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9131 = new String[]{method4597(method4596("\t\u001c;\u00193")), method4597(method4596("\t\u001c;-n\u0016G")), method4597(method4596("\t\u001c;\u001b3")), method4597(method4596("\t\u001c;\u001e3")), method4597(method4596("\u0010\u001ba/!W@")), method4597(method4596("W\u0001p(hV\u0018f`|\u0019\u0002pb")), method4597(method4596("\t\u001c;\u001d3")), method4597(method4596("\t\u001c;\u001c3"))};
   @OriginalMember(
      owner = "client!qs",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field9121 = new int[]{2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0};
   @OriginalMember(
      owner = "client!qs",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field9129 = new int[14];
   @OriginalMember(
      owner = "client!qs",
      name = "h",
      descriptor = "I"
   )
   public static int field9122;
   @OriginalMember(
      owner = "client!qs",
      name = "c",
      descriptor = "I"
   )
   public static int field9124;
   @OriginalMember(
      owner = "client!qs",
      name = "a",
      descriptor = "I"
   )
   public static int field9127;
   @OriginalMember(
      owner = "client!qs",
      name = "j",
      descriptor = "I"
   )
   public static int field9128;
   @OriginalMember(
      owner = "client!qs",
      name = "d",
      descriptor = "I"
   )
   public static int field9130;
   @OriginalMember(
      owner = "client!qs",
      name = "i",
      descriptor = "Leca;"
   )
   private class789 field9120;
   @OriginalMember(
      owner = "client!qs",
      name = "g",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field9126;
   @OriginalMember(
      owner = "client!qs",
      name = "b",
      descriptor = "Z"
   )
   private volatile boolean field9125;
   @OriginalMember(
      owner = "client!qs",
      name = "f",
      descriptor = "[Lfha;"
   )
   private class396[] field9123;

   @OriginalMember(
      owner = "client!qs",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4590(byte arg0) {
      try {
         field9129 = null;
         if (arg0 <= 50) {
            field9129 = null;
         }

         field9121 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9131[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qs",
      name = "a",
      descriptor = "(Lmc;Z)Z"
   )
   public static final boolean method4591(class144 arg0, boolean arg1) {
      boolean var2 = class455.field6647 == class269.field3810;
      int var3 = 0;
      short var4 = 0;
      byte var5 = 0;
      arg0.method1363((byte)-67);
      if (arg0.field2354 >= 0 && arg0.field2347 >= 0 && arg0.field2356 < class479.field6989 && arg0.field2348 < class357.field5100) {
         short var6 = 0;

         for(int var7 = arg0.field2354; var7 <= arg0.field2356; ++var7) {
            for(int var11 = arg0.field2347; var11 <= arg0.field2348; ++var11) {
               class600 var12 = class18.method134(arg0.field4090, var7, var11);
               if (var12 != null) {
                  class533 var13 = class722.method5240(4, arg0);
                  class533 var14 = var12.field8653;
                  if (var14 == null) {
                     var12.field8653 = var13;
                  } else {
                     while(var14.field7763 != null) {
                        var14 = var14.field7763;
                     }

                     var14.field7763 = var13;
                  }

                  if (var2 && (class544.field7886[var7][var11] & -16777216) != 0) {
                     var3 = class544.field7886[var7][var11];
                     var4 = class569.field8236[var7][var11];
                     var5 = class634.field9246[var7][var11];
                  }

                  if (!arg1 && var12.field8654 != null && var12.field8654.field6097 > var6) {
                     var6 = var12.field8654.field6097;
                  }
               }
            }
         }

         if (var2 && (var3 & -16777216) != 0) {
            for(int var8 = arg0.field2354; var8 <= arg0.field2356; ++var8) {
               for(int var9 = arg0.field2347; var9 <= arg0.field2348; ++var9) {
                  if ((class544.field7886[var8][var9] & -16777216) == 0) {
                     class544.field7886[var8][var9] = var3;
                     class569.field8236[var8][var9] = var4;
                     class634.field9246[var8][var9] = var5;
                  }
               }
            }
         }

         if (arg1) {
            class649.field9413[class103.field1682++] = arg0;
         } else {
            int var10 = class455.field6647 == class269.field3810 ? 1 : 0;
            if (arg0.method593((byte)-94)) {
               if (arg0.method588(1)) {
                  arg0.field4088 = class559.field8137[var10];
                  class559.field8137[var10] = arg0;
               } else {
                  arg0.field4088 = class529.field7698[var10];
                  class529.field7698[var10] = arg0;
                  class186.field2818 = true;
               }
            } else {
               arg0.field4088 = class389.field5744[var10];
               class389.field5744[var10] = arg0;
            }
         }

         if (arg1) {
            arg0.field4097 -= var6;
         }

         return true;
      } else {
         return false;
      }
   }

   @OriginalMember(
      owner = "client!qs",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method4592(int arg0) {
      try {
         ++field9130;
         if (arg0 != 5677) {
            method4590((byte)-89);
         }

         if (this.field9125) {
            return true;
         } else {
            if (this.field9120 == null) {
               try {
                  int var2 = class628.field9136 != class409.field6010 ? class415.field6082.field9569 + 7000 : 80;
                  this.field9120 = class412.field6033.method4785(4, new URL(field9131[4] + class415.field6082.field9570 + ":" + var2 + field9131[5] + class128.field2145.field4608));
               } catch (MalformedURLException var4) {
                  return true;
               }
            }

            if (this.field9120 != null && this.field9120.field11542 != 2) {
               if (this.field9120.field11542 != 1) {
                  return false;
               } else {
                  if (this.field9126 == null) {
                     this.field9126 = new Thread(this);
                     this.field9126.start();
                  }

                  return this.field9125;
               }
            } else {
               return true;
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field9131[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qs",
      name = "a",
      descriptor = "(IBI)V"
   )
   public static final void method4593(int arg0, byte arg1, int arg2) {
      try {
         ++field9122;
         class536 var3 = class108.method1038((long)arg2, 9, 5);
         if (arg1 < 90) {
            field9129 = null;
         }

         var3.method4017(24076);
         var3.field7800 = arg0;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field9131[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qs",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qs",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method4594(boolean arg0) {
      try {
         if (arg0) {
            class344.field4901 = -1;
            class770.field11213 = -1;
            ++field9128;
            class733.field10534 = 0;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9131[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qs",
      name = "a",
      descriptor = "(BI)Lfha;"
   )
   public final class396 method4595(byte arg0, int arg1) {
      try {
         ++field9127;
         if (arg0 < 18) {
            this.method4595((byte)94, -53);
         }

         return this.field9123 != null && arg1 >= 0 && this.field9123.length > arg1 ? this.field9123[arg1] : null;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9131[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4596(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 27);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4597(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 95;
            break;
         default:
            var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
