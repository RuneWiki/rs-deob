import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class179 {
   @OriginalMember(
      owner = "client!gw",
      name = "l",
      descriptor = "Lrw;"
   )
   private class788 field2760;
   @OriginalMember(
      owner = "client!gw",
      name = "b",
      descriptor = "I"
   )
   private int field2756;
   @OriginalMember(
      owner = "client!gw",
      name = "j",
      descriptor = "I"
   )
   private int field2758;
   @OriginalMember(
      owner = "client!gw",
      name = "k",
      descriptor = "Lld;"
   )
   private class178 field2757;
   @OriginalMember(
      owner = "client!gw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2775 = new String[]{method1595(method1594("\u0018~\u000b}*")), method1595(method1594("\u0018~\u000bt*")), method1595(method1594("\u0004'\u000b\u0019\u007f")), method1595(method1594("\u0011|I[")), method1595(method1594("\u0018~\u000by*")), method1595(method1594("\u0018~\u000bv*")), method1595(method1594("\u0018~\u000bp*")), method1595(method1594("\u0018~\u000b\u000bk\u0011`Q\t*")), method1595(method1594("\u0018~\u000b~*")), method1595(method1594("\u0018~\u000bs*")), method1595(method1594("\u0018~\u000br*")), method1595(method1594("\f7FD")), method1595(method1594("\u0018~\u000b\u007f*")), method1595(method1594("\u0018~\u000bx*")), method1595(method1594("\u0018~\u000b|*")), method1595(method1594("\u0018~\u000bu*")), method1595(method1594("\u0018~\u000bz*")), method1595(method1594("\u0018~\u000b{*")), method1595(method1594("\u0018~\u000bq*"))};
   @OriginalMember(
      owner = "client!gw",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field2764 = new int[1];
   @OriginalMember(
      owner = "client!gw",
      name = "s",
      descriptor = "I"
   )
   public static int field2759;
   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "I"
   )
   public static int field2761;
   @OriginalMember(
      owner = "client!gw",
      name = "g",
      descriptor = "I"
   )
   public static int field2762;
   @OriginalMember(
      owner = "client!gw",
      name = "n",
      descriptor = "I"
   )
   public static int field2763;
   @OriginalMember(
      owner = "client!gw",
      name = "h",
      descriptor = "I"
   )
   public static int field2765;
   @OriginalMember(
      owner = "client!gw",
      name = "m",
      descriptor = "I"
   )
   public static int field2766;
   @OriginalMember(
      owner = "client!gw",
      name = "d",
      descriptor = "I"
   )
   public static int field2767;
   @OriginalMember(
      owner = "client!gw",
      name = "c",
      descriptor = "I"
   )
   public static int field2768;
   @OriginalMember(
      owner = "client!gw",
      name = "q",
      descriptor = "I"
   )
   public static int field2769;
   @OriginalMember(
      owner = "client!gw",
      name = "o",
      descriptor = "I"
   )
   public static int field2770;
   @OriginalMember(
      owner = "client!gw",
      name = "f",
      descriptor = "I"
   )
   public static int field2771;
   @OriginalMember(
      owner = "client!gw",
      name = "e",
      descriptor = "I"
   )
   public static int field2772;
   @OriginalMember(
      owner = "client!gw",
      name = "r",
      descriptor = "I"
   )
   public static int field2773;
   @OriginalMember(
      owner = "client!gw",
      name = "p",
      descriptor = "I"
   )
   public static int field2774;

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(II)V",
      line = 3
   )
   public final void method1579(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         if (class693.field10165 != null) {
            class754 var4 = (class754)this.field2760.method5680(false);
            if (var3 || var4 != null) {
               do {
                  label36: {
                     if (var4.method1865(86)) {
                        if (var4.method1864(true) != null) {
                           break label36;
                        }

                        var4.method154(1);
                        var4.method2385(117);
                        this.field2756 += var4.field10954;
                        if (!var3) {
                           break label36;
                        }
                     }

                     if (++var4.field4416 > (long)arg1) {
                        class754 var5 = class693.field10165.method3126(var4, -1);
                        this.field2757.method1566(var5, 24742, var4.field347);
                        class149.method1390(var5, var4, -16940);
                        var4.method154(-107);
                        var4.method2385(117);
                     }
                  }

                  var4 = (class754)this.field2760.method5676(-13612);
               } while(var4 != null);
            }
         }

         int var6 = 88 / ((39 - arg0) / 44);
         ++field2767;
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field2775[16] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "f",
      descriptor = "(B)I",
      line = 51
   )
   public final int method1580(byte arg0) {
      try {
         ++field2772;
         if (arg0 != 122) {
            this.method1593(false);
         }

         return this.field2758;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2775[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(JILjava/lang/Object;)V",
      line = 64
   )
   public final void method1581(long arg0, int arg1, Object arg2) {
      try {
         ++field2763;
         if (arg1 == 0) {
            this.method1587(1, arg2, arg0, arg1 + 32383);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2775[18] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2775[2] : field2775[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "b",
      descriptor = "(I)Ljava/lang/Object;",
      line = 76
   )
   public final Object method1582(int arg0) {
      boolean var2 = client.field4564;

      try {
         if (arg0 != -27831) {
            return null;
         } else {
            ++field2761;
            class754 var3 = (class754)this.field2757.method1575((byte)-118);
            if (!var2 && var3 == null) {
               return null;
            } else {
               Object var4;
               while(true) {
                  var4 = var3.method1864(true);
                  if (var4 != null) {
                     break;
                  }

                  class754 var5 = var3;
                  var3 = (class754)this.field2757.method1575((byte)-128);
                  var5.method154(42);
                  var5.method2385(117);
                  this.field2756 += var5.field10954;
                  if (var2) {
                     break;
                  }

                  if (var3 == null) {
                     return null;
                  }
               }

               return var4;
            }
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field2775[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "b",
      descriptor = "(B)I",
      line = 107
   )
   public final int method1583(byte arg0) {
      try {
         ++field2770;
         if (arg0 != 78) {
            this.field2757 = null;
         }

         return this.field2756;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2775[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "<init>",
      descriptor = "(I)V",
      line = 124
   )
   public class179(int arg0) {
      this(arg0, arg0);
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(JI)Ljava/lang/Object;",
      line = 127
   )
   public final Object method1584(long arg0, int arg1) {
      try {
         ++field2771;
         if (arg1 != 1) {
            this.field2756 = -114;
         }

         class754 var4 = (class754)this.field2757.method1572(arg0, -16289);
         if (var4 == null) {
            return null;
         } else {
            Object var5 = var4.method1864(true);
            if (var5 == null) {
               var4.method154(-104);
               var4.method2385(117);
               this.field2756 += var4.field10954;
               return null;
            } else {
               if (var4.method1865(83)) {
                  class704 var6 = new class704(var5, var4.field10954);
                  this.field2757.method1566(var6, 24742, var4.field347);
                  this.field2760.method5681(var6, (byte)-103);
                  var6.field4416 = 0L;
                  var4.method154(-115);
                  var4.method2385(117);
                  if (!client.field4564) {
                     return var5;
                  }
               }

               this.field2760.method5681(var4, (byte)-85);
               var4.field4416 = 0L;
               return var5;
            }
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field2775[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(ILpea;)V",
      line = 169
   )
   private final void method1585(int arg0, class754 arg1) {
      try {
         if (arg1 != null) {
            arg1.method154(56);
            arg1.method2385(117);
            this.field2756 += arg1.field10954;
         }

         ++field2759;
         if (arg0 != 0) {
            this.field2757 = null;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2775[4] + arg0 + ',' + (arg1 != null ? field2775[2] : field2775[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "<init>",
      descriptor = "(II)V",
      line = 317
   )
   public class179(int arg0, int arg1) {
      this.field2760 = new class788();

      try {
         this.field2756 = arg0;
         this.field2758 = arg0;

         int var3;
         for(var3 = 1; ~arg0 < ~(var3 + var3) && ~arg1 < ~var3; var3 += var3) {
         }

         this.field2757 = new class178(var3);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2775[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(I)Ljava/lang/Object;",
      line = 195
   )
   public final Object method1586(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field2774;
         if (arg0 != 0) {
            return null;
         } else {
            class754 var3 = (class754)this.field2757.method1567((byte)-44);
            if (!var2 && var3 == null) {
               return null;
            } else {
               Object var4;
               while(true) {
                  var4 = var3.method1864(true);
                  if (var4 != null) {
                     break;
                  }

                  class754 var5 = var3;
                  var3 = (class754)this.field2757.method1575((byte)-123);
                  var5.method154(-116);
                  var5.method2385(117);
                  this.field2756 += var5.field10954;
                  if (var2) {
                     break;
                  }

                  if (var3 == null) {
                     return null;
                  }
               }

               return var4;
            }
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field2775[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(ILjava/lang/Object;JI)V",
      line = 229
   )
   public final void method1587(int param1, Object param2, long param3, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gw",
      name = "d",
      descriptor = "(B)V",
      line = 261
   )
   public static void method1588(byte arg0) {
      try {
         if (arg0 < 38) {
            method1590((byte)-24);
         }

         field2764 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2775[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "e",
      descriptor = "(B)V",
      line = 272
   )
   public final void method1589(byte arg0) {
      try {
         ++field2773;
         this.field2760.method5675((byte)58);
         this.field2757.method1570((byte)15);
         this.field2756 = this.field2758;
         if (arg0 <= 40) {
            this.method1579(-72, -27);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2775[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(B)V",
      line = 286
   )
   public static final void method1590(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gw",
      name = "c",
      descriptor = "(B)V",
      line = 332
   )
   public final void method1591(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(ZJ)V",
      line = 357
   )
   private final void method1592(boolean arg0, long arg1) {
      try {
         ++field2768;
         if (!arg0) {
            class754 var4 = (class754)this.field2757.method1572(arg1, -16289);
            this.method1585(0, var4);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2775[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "a",
      descriptor = "(Z)I",
      line = 372
   )
   public final int method1593(boolean arg0) {
      boolean var2 = client.field4564;

      try {
         if (!arg0) {
            this.method1585(0, (class754)null);
         }

         ++field2762;
         int var3 = 0;
         class754 var4 = (class754)this.field2760.method5680(false);
         if (var2) {
            if (!var4.method1865(78)) {
               ++var3;
            }

            var4 = (class754)this.field2760.method5676(-13612);
         }

         while(true) {
            int var10000;
            if (var4 == null) {
               var10000 = var3;
               if (!var2) {
                  return var3;
               }
            } else {
               var10000 = var4.method1865(78);
            }

            if (var10000 == 0) {
               ++var3;
            }

            var4 = (class754)this.field2760.method5676(-13612);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2775[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1594(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1595(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 127;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 37;
            break;
         case 3:
            var10005 = 55;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
