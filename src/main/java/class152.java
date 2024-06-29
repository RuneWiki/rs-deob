import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class152 implements class99 {
   @OriginalMember(
      owner = "client!wk",
      name = "e",
      descriptor = "Lwia;"
   )
   private class791 field1911 = new class791(128);
   @OriginalMember(
      owner = "client!wk",
      name = "c",
      descriptor = "[I"
   )
   public int[] field1905;
   @OriginalMember(
      owner = "client!wk",
      name = "l",
      descriptor = "[I"
   )
   private int[] field1913;
   @OriginalMember(
      owner = "client!wk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1917 = new String[]{method1255(method1254("\u001eRWN\u0011")), method1255(method1254("\u001eRWI\u0011")), method1255(method1254("\u001eRW4P\u0007P\r6\u0011")), method1255(method1254("\u001eRWA\u0011")), method1255(method1254("\u001eRWJ\u0011")), method1255(method1254("\u001eRW@\u0011")), method1255(method1254("\u001eRWO\u0011")), method1255(method1254("\u001eRWB\u0011")), method1255(method1254("\u001eRWM\u0011")), method1255(method1254("\u001eRWL\u0011")), method1255(method1254("\u001eRWC\u0011")), method1255(method1254("\u001eRWK\u0011"))};
   @OriginalMember(
      owner = "client!wk",
      name = "m",
      descriptor = "[I"
   )
   public static int[] field1902 = new int[3];
   @OriginalMember(
      owner = "client!wk",
      name = "a",
      descriptor = "Lsd;"
   )
   public static class101 field1915 = new class101(1, -1);
   @OriginalMember(
      owner = "client!wk",
      name = "k",
      descriptor = "I"
   )
   public static int field1916 = -1;
   @OriginalMember(
      owner = "client!wk",
      name = "h",
      descriptor = "I"
   )
   public static int field1900;
   @OriginalMember(
      owner = "client!wk",
      name = "o",
      descriptor = "I"
   )
   public static int field1901;
   @OriginalMember(
      owner = "client!wk",
      name = "p",
      descriptor = "I"
   )
   public static int field1903;
   @OriginalMember(
      owner = "client!wk",
      name = "g",
      descriptor = "I"
   )
   public static int field1904;
   @OriginalMember(
      owner = "client!wk",
      name = "n",
      descriptor = "I"
   )
   public static int field1906;
   @OriginalMember(
      owner = "client!wk",
      name = "q",
      descriptor = "I"
   )
   public static int field1907;
   @OriginalMember(
      owner = "client!wk",
      name = "j",
      descriptor = "I"
   )
   public static int field1908;
   @OriginalMember(
      owner = "client!wk",
      name = "f",
      descriptor = "I"
   )
   public static int field1909;
   @OriginalMember(
      owner = "client!wk",
      name = "d",
      descriptor = "I"
   )
   public static int field1910;
   @OriginalMember(
      owner = "client!wk",
      name = "i",
      descriptor = "I"
   )
   public static int field1912;
   @OriginalMember(
      owner = "client!wk",
      name = "b",
      descriptor = "I"
   )
   public static int field1914;

   @OriginalMember(
      owner = "client!wk",
      name = "a",
      descriptor = "(I)V",
      line = 3
   )
   public final void method1245(int arg0) {
      int var2 = client.field4530;

      try {
         if (arg0 >= 77) {
            int var3 = 0;
            if (var2 == 0 && class748.field11092.field7090 <= var3) {
               ++field1914;
               this.field1911 = new class791(128);
            } else {
               do {
                  class187 var4 = class748.field11092.method3539(var3, -123);
                  if (var4 != null && ~var4.field2338 == -1) {
                     this.field1913[var3] = 0;
                     this.field1905[var3] = 0;
                  }

                  ++var3;
               } while(class748.field11092.field7090 > var3);

               ++field1914;
               this.field1911 = new class791(128);
            }
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field1917[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wk",
      name = "a",
      descriptor = "(III)V",
      line = 39
   )
   public final void method1246(int arg0, int arg1, int arg2) {
      try {
         ++field1912;
         int var4 = -66 / ((arg0 - 84) / 33);
         this.field1913[arg2] = arg1;
         class165 var5 = (class165)this.field1911.method5681((long)arg2, -1);
         if (var5 == null) {
            class165 var6 = new class165(4611686018427387905L);
            this.field1911.method5682((long)arg2, var6, (byte)7);
         } else if (var5.field2068 != 4611686018427387905L) {
            var5.field2068 = 4611686018427387904L | class188.method1462(true) - -500L;
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field1917[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wk",
      name = "b",
      descriptor = "(III)V",
      line = 69
   )
   public final void method1247(int arg0, int arg1, int arg2) {
      try {
         ++field1904;
         int var4 = 29 / ((arg2 - 1) / 58);
         class678 var5 = class639.field9324.method3993(-103, arg0);
         int var6 = var5.field10204;
         int var7 = var5.field10200;
         int var8 = var5.field10201;
         int var9 = class91.field1168[-var7 + var8];
         if (~arg1 > -1 || var9 < arg1) {
            arg1 = 0;
         }

         int var10 = var9 << var7;
         this.method1251(false, arg1 << var7 & var10 | this.field1905[var6] & ~var10, var6);
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field1917[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wk",
      name = "a",
      descriptor = "(II)I",
      line = 97
   )
   public final int method867(int arg0, int arg1) {
      try {
         if (arg0 != -1) {
            field1902 = null;
         }

         ++field1910;
         return this.field1905[arg1];
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1917[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wk",
      name = "a",
      descriptor = "(ZB)I",
      line = 108
   )
   public final int method1248(boolean arg0, byte arg1) {
      int var3 = client.field4530;

      try {
         class165 var6;
         label56: {
            ++field1900;
            long var4 = class188.method1462(true);
            var6 = arg0 ? (class165)this.field1911.method5677((byte)44) : (class165)this.field1911.method5671(-121);
            if (var3 != 0) {
               if (~(4611686018427387903L & var6.field2068) > ~var4) {
                  if (~(var6.field2068 & 4611686018427387904L) != -1L) {
                     break label56;
                  }

                  var6.method2720(0);
                  if (var3 != 0) {
                     break label56;
                  }
               }

               var6 = (class165)this.field1911.method5671(38);
            }

            while(true) {
               int var10000;
               if (var6 == null) {
                  var10000 = arg1;
                  if (var3 == 0) {
                     if (arg1 != 125) {
                        method1250((byte)25);
                     }

                     return -1;
                  }
               } else {
                  long var10;
                  var10000 = (var10 = ~(4611686018427387903L & var6.field2068) - ~var4) == 0L ? 0 : (var10 < 0L ? -1 : 1);
               }

               if (var10000 > 0) {
                  if (~(var6.field2068 & 4611686018427387904L) != -1L) {
                     break;
                  }

                  var6.method2720(0);
                  if (var3 != 0) {
                     break;
                  }
               }

               var6 = (class165)this.field1911.method5671(38);
            }
         }

         int var7 = (int)var6.field5280;
         this.field1905[var7] = this.field1913[var7];
         var6.method2720(arg1 ^ 125);
         return var7;
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field1917[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wk",
      name = "b",
      descriptor = "(II)I",
      line = 148
   )
   public final int method866(int arg0, int arg1) {
      try {
         ++field1908;
         class678 var3 = class639.field9324.method3993(arg1 + -15820, arg0);
         int var4 = var3.field10204;
         if (arg1 != 15710) {
            this.method1246(-96, -122, 66);
         }

         int var5 = var3.field10200;
         int var6 = var3.field10201;
         int var7 = class91.field1168[var6 - var5];
         return var7 & this.field1905[var4] >> var5;
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field1917[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wk",
      name = "b",
      descriptor = "(I)Z",
      line = 171
   )
   public static final boolean method1249(int arg0) {
      try {
         if (arg0 != -7966) {
            field1915 = null;
         }

         ++field1907;
         return class627.field9106 != 0 ? true : class663.field9609.method449((byte)-35);
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1917[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wk",
      name = "a",
      descriptor = "(B)V",
      line = 186
   )
   public static void method1250(byte arg0) {
      try {
         int var1 = -125 % ((arg0 - -44) / 57);
         field1915 = null;
         field1902 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1917[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wk",
      name = "a",
      descriptor = "(ZII)V",
      line = 199
   )
   public final void method1251(boolean arg0, int arg1, int arg2) {
      try {
         if (arg0) {
            field1902 = null;
         }

         this.field1905[arg2] = arg1;
         ++field1903;
         class165 var4 = (class165)this.field1911.method5681((long)arg2, -1);
         if (var4 == null) {
            class165 var5 = new class165(500L + class188.method1462(!arg0));
            this.field1911.method5682((long)arg2, var5, (byte)7);
         } else {
            var4.field2068 = class188.method1462(true) - -500L;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field1917[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wk",
      name = "c",
      descriptor = "(II)I",
      line = 227
   )
   public static final int method1252(int arg0, int arg1) {
      try {
         if (arg0 != 1) {
            field1915 = null;
         }

         ++field1909;
         return arg1 >>> 8;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1917[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wk",
      name = "a",
      descriptor = "(BII)V",
      line = 238
   )
   public final void method1253(byte arg0, int arg1, int arg2) {
      try {
         ++field1901;
         class678 var4 = class639.field9324.method3993(-94, arg1);
         int var5 = var4.field10204;
         int var6 = var4.field10200;
         int var7 = var4.field10201;
         int var8 = class91.field1168[-var6 + var7];
         if (~arg2 > -1 || ~var8 > ~arg2) {
            arg2 = 0;
         }

         if (arg0 >= 98) {
            int var9 = var8 << var6;
            this.method1246(-73, this.field1913[var5] & ~var9 | var9 & arg2 << var6, var5);
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field1917[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wk",
      name = "<init>",
      descriptor = "()V",
      line = 270
   )
   public class152() {
      try {
         this.field1905 = new int[class748.field11092.field7090];
         this.field1913 = new int[class748.field11092.field7090];
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1917[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!wk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1254(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 57);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1255(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 57;
            break;
         case 2:
            var10005 = 121;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 57;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
