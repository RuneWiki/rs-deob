import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class345 {
   @OriginalMember(
      owner = "client!vv",
      name = "g",
      descriptor = "J"
   )
   public long field4666;
   @OriginalMember(
      owner = "client!vv",
      name = "d",
      descriptor = "Lea;"
   )
   private class573 field4669;
   @OriginalMember(
      owner = "client!vv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4673 = new String[]{method2531(method2530("\u0017t_L")), method2531(method2530("\u0002/\u001d\u000e2")), method2531(method2530("\u000fw\u001dag")), method2531(method2530("\u000fw\u001d\u001c&\u0017hG\u001eg")), method2531(method2530("\u000fw\u001dcg")), method2531(method2530("\u000fw\u001dbg")), method2531(method2530("\u000fw\u001ddg")), method2531(method2530("\u000fw\u001dF&\u0017`_I5\u001c)"))};
   @OriginalMember(
      owner = "client!vv",
      name = "e",
      descriptor = "Lqca;"
   )
   public static class127 field4670 = new class127(9, 2);
   @OriginalMember(
      owner = "client!vv",
      name = "b",
      descriptor = "I"
   )
   public static int field4667;
   @OriginalMember(
      owner = "client!vv",
      name = "c",
      descriptor = "I"
   )
   public static int field4668;
   @OriginalMember(
      owner = "client!vv",
      name = "f",
      descriptor = "I"
   )
   public static int field4671;
   @OriginalMember(
      owner = "client!vv",
      name = "a",
      descriptor = "I"
   )
   public static int field4672;

   @OriginalMember(
      owner = "client!vv",
      name = "a",
      descriptor = "(IJ)V",
      line = 3
   )
   public static final void method2526(int arg0, long arg1) {
      boolean var3 = client.field4360;

      try {
         if (class663.field9659 != null) {
            label81: {
               if (class380.field5481 == 1 || ~class380.field5481 == -6) {
                  class612.method4449(arg1, 6406);
                  if (!var3) {
                     break label81;
                  }
               }

               if (~class380.field5481 == -5) {
                  class732.method5328(arg1, true);
               }
            }
         }

         ++field4667;
         class182.method1447(0, class383.field5543, (long)class96.field1234);
         if (~class185.field2623 != 0) {
            class454.method3315(class185.field2623, false);
         }

         int var4 = -49 / ((arg0 - -36) / 50);
         int var5 = 0;
         if (var3) {
            if (class188.field2673[var5]) {
               class301.field4123[var5] = true;
            }

            class299.field4092[var5] = class188.field2673[var5];
            class188.field2673[var5] = false;
            ++var5;
         }

         while(true) {
            int var10000;
            if (var5 >= class425.field6085) {
               class355.field4783 = class96.field1234;
               class510.method3703((class678)null, -1, 11, -1);
               class727.method5301(-1, (byte)7, -1, (class678)null);
               var10000 = class185.field2623;
               if (!var3) {
                  if (var10000 != -1) {
                     class425.field6085 = 0;
                     class621.method4519((byte)125);
                  }

                  class383.field5543.method574();
                  class365.method2723(class383.field5543, true);
                  int var6 = class119.method949(0);
                  if (~var6 == 0) {
                     var6 = class146.field1843;
                  }

                  if (~var6 == 0) {
                     var6 = class450.field6386;
                  }

                  class277.method2105(var6, 57);
                  int var7 = class564.field8045.method972(-1) << 8;
                  class416.method3110(class564.field8045.field10694 + var7, (byte)-122, class564.field8045.field10701, class564.field8045.field10693 + var7, class294.field4045);
                  class294.field4045 = 0;
                  return;
               }
            } else {
               var10000 = class188.field2673[var5];
            }

            if (var10000 != 0) {
               class301.field4123[var5] = true;
            }

            class299.field4092[var5] = class188.field2673[var5];
            class188.field2673[var5] = false;
            ++var5;
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field4673[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vv",
      name = "finalize",
      descriptor = "()V",
      line = 71
   )
   protected final void finalize() throws Throwable {
      try {
         this.field4669.method4152(this.field4666, (byte)-66);
         ++field4672;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4673[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!vv",
      name = "a",
      descriptor = "(ILjava/lang/Object;Z)[B",
      line = 83
   )
   public static final byte[] method2527(int arg0, Object arg1, boolean arg2) {
      try {
         ++field4668;
         if (arg1 == null) {
            return null;
         } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[])arg1;
            return !arg2 ? var3 : class677.method4926(var3, 86);
         } else if (arg0 > -58) {
            return null;
         } else if (arg1 instanceof class361) {
            class361 var4 = (class361)arg1;
            return var4.method2310((byte)-85);
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field4673[2] + arg0 + ',' + (arg1 != null ? field4673[1] : field4673[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vv",
      name = "b",
      descriptor = "(I)V",
      line = 118
   )
   public static void method2528(int arg0) {
      try {
         int var1 = 82 % ((6 - arg0) / 60);
         field4670 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4673[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vv",
      name = "<init>",
      descriptor = "(Lea;J[Ltc;)V",
      line = 134
   )
   public class345(class573 arg0, long arg1, class373[] arg2) {
      try {
         this.field4666 = arg1;
         this.field4669 = arg0;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field4673[3] + (arg0 != null ? field4673[1] : field4673[0]) + ',' + arg1 + ',' + (arg2 != null ? field4673[1] : field4673[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vv",
      name = "a",
      descriptor = "(I)V",
      line = 145
   )
   public static final void method2529(int arg0) {
      try {
         class95.field1226 = 0;
         class755.field11185 = -1;
         class715.field10406 = -1;
         ++field4671;
         class140.field1791 = -1;
         if (arg0 <= 5) {
            field4670 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4673[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2530(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 79);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2531(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 121;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 51;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 79;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
