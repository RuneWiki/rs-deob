import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class321 {
   @OriginalMember(
      owner = "client!vt",
      name = "g",
      descriptor = "Loi;"
   )
   private class80 field4380 = new class80(64);
   @OriginalMember(
      owner = "client!vt",
      name = "b",
      descriptor = "I"
   )
   public int field4391 = 0;
   @OriginalMember(
      owner = "client!vt",
      name = "k",
      descriptor = "Lkf;"
   )
   private class266 field4388;
   @OriginalMember(
      owner = "client!vt",
      name = "d",
      descriptor = "I"
   )
   public int field4385;
   @OriginalMember(
      owner = "client!vt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4392 = new String[]{method2384(method2383("h:TKO")), method2384(method2383("h:T@O")), method2384(method2383("h:TFO")), method2384(method2383("h:TDO")), method2384(method2383("h:TEO")), method2384(method2383("h:TJO")), method2384(method2383("h:TBO")), method2384(method2383("p;\u0016o")), method2384(method2383("h:T?\u000ep'\u000e=O")), method2384(method2383("e`T-\u001a")), method2384(method2383("h:TAO"))};
   @OriginalMember(
      owner = "client!vt",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field4386 = new int[32];
   @OriginalMember(
      owner = "client!vt",
      name = "l",
      descriptor = "I"
   )
   public static int field4381;
   @OriginalMember(
      owner = "client!vt",
      name = "e",
      descriptor = "I"
   )
   public static int field4382;
   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "I"
   )
   public static int field4383;
   @OriginalMember(
      owner = "client!vt",
      name = "h",
      descriptor = "I"
   )
   public static int field4384;
   @OriginalMember(
      owner = "client!vt",
      name = "c",
      descriptor = "I"
   )
   public static int field4387;
   @OriginalMember(
      owner = "client!vt",
      name = "j",
      descriptor = "I"
   )
   public static int field4389;
   @OriginalMember(
      owner = "client!vt",
      name = "f",
      descriptor = "I"
   )
   public static int field4390;

   @OriginalMember(
      owner = "client!vt",
      name = "b",
      descriptor = "(I)I",
      line = 6
   )
   public static final int method2374(int arg0) {
      try {
         ++field4389;
         if (arg0 != 1) {
            field4386 = null;
         }

         return class723.field10551;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4392[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "(ZI)Z",
      line = 17
   )
   public static final boolean method2375(boolean arg0, int arg1) {
      try {
         if (arg0) {
            field4386 = null;
         }

         ++field4383;
         return arg1 == 11 || arg1 == 12 || ~arg1 == -14;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4392[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "(Lgn;ZZ)V",
      line = 31
   )
   public static final void method2376(class731 arg0, boolean arg1, boolean arg2) {
      arg0.field10706 = arg2;
      if (class767.field11310) {
         if (arg1) {
            class390.field5654[class390.field5654.length - 1].method1560(-201, arg0);
         } else {
            int var3 = class662.method4833(arg0.field10692);
            int var4 = class298.field4085[2] * arg0.method248(-1) / arg0.field10707;
            int var5 = class662.method4833(arg0.field10692 - var4);
            int var6 = class662.method4833(arg0.field10692 + var4);
            if (var5 == var6) {
               class390.field5654[var3].method1560(-201, arg0);
            } else if (var6 - var5 == 1) {
               class390.field5654[class199.field2833 + var5].method1560(-201, arg0);
            } else {
               class390.field5654[class390.field5654.length - 1].method1560(-201, arg0);
            }
         }
      } else {
         class516.method3759(arg0, class397.field5737);
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "b",
      descriptor = "(II)Lrl;",
      line = 65
   )
   public final class754 method2377(int arg0, int arg1) {
      try {
         ++field4384;
         class80 var3 = this.field4380;
         class754 var4;
         synchronized(this.field4380) {
            if (arg1 != 64) {
               method2374(1);
            }

            var4 = (class754)this.field4380.method725(0, (long)arg0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class266 var5 = this.field4388;
            byte[] var6;
            synchronized(this.field4388) {
               var6 = this.field4388.method2037(false, arg0, 4);
            }

            class754 var7 = new class754();
            var7.field11169 = this;
            var7.field11161 = arg0;
            if (var6 != null) {
               var7.method5475(new class147(var6), 0);
            }

            var7.method5474(arg1 + -597651640);
            class80 var8 = this.field4380;
            synchronized(this.field4380) {
               this.field4380.method723(0, (long)arg0, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field4392[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "(B)V",
      line = 98
   )
   public final void method2378(byte arg0) {
      try {
         class80 var2 = this.field4380;
         synchronized(this.field4380) {
            this.field4380.method715(true);
         }

         ++field4381;
         if (arg0 != 122) {
            this.method2377(-85, 66);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field4392[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "(II)V",
      line = 111
   )
   public final void method2379(int arg0, int arg1) {
      try {
         ++field4382;
         class80 var3 = this.field4380;
         synchronized(this.field4380) {
            this.field4380.method726(arg0, arg1 + -1277);
            if (arg1 != 26601) {
               method2381(-12, true);
            }

         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field4392[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "(I)V",
      line = 125
   )
   public final void method2380(int arg0) {
      try {
         ++field4390;
         class80 var2 = this.field4380;
         synchronized(this.field4380) {
            if (arg0 != -6121) {
               this.field4388 = null;
            }

            this.field4380.method731(0);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field4392[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "(IZ)V",
      line = 143
   )
   public static final void method2381(int arg0, boolean arg1) {
      try {
         label20: {
            if (class4.field38 == 0) {
               class270.field3737.method4243(arg0, (byte)-94);
               if (!client.field4360) {
                  break label20;
               }
            }

            class57.field705 = arg0;
         }

         if (!arg1) {
            ++field4387;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4392[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "c",
      descriptor = "(I)V",
      line = 161
   )
   public static void method2382(int arg0) {
      try {
         field4386 = null;
         if (arg0 != 4) {
            method2374(-10);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4392[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "<init>",
      descriptor = "(Lno;ILkf;)V",
      line = 182
   )
   public class321(class732 arg0, int arg1, class266 arg2) {
      try {
         this.field4388 = arg2;
         this.field4385 = this.field4388.method2060(2, 4);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field4392[8] + (arg0 != null ? field4392[9] : field4392[7]) + ',' + arg1 + ',' + (arg2 != null ? field4392[9] : field4392[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2383(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2384(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 30;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 122;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
