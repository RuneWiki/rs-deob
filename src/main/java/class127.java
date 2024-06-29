import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class class127 {
   @OriginalMember(
      owner = "client!vt",
      name = "e",
      descriptor = "Liw;"
   )
   private class107 field2035 = new class107(64);
   @OriginalMember(
      owner = "client!vt",
      name = "f",
      descriptor = "Lsa;"
   )
   private class39 field2043;
   @OriginalMember(
      owner = "client!vt",
      name = "j",
      descriptor = "Lwh;"
   )
   public class350 field2044;
   @OriginalMember(
      owner = "client!vt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2046 = new String[]{method1307(method1306("R\r1d<J\u0010kf}")), method1307(method1306("J\fs4")), method1307(method1306("_W1v(")), method1307(method1306("R\r1\u001a}")), method1307(method1306("R\r1\u001b}")), method1307(method1306("R\r1\u001e}")), method1307(method1306("R\r1\u0019}")), method1307(method1306("R\r1\u001c}")), method1307(method1306("R\r1\u001d}"))};
   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "Z"
   )
   public static volatile boolean field2045 = true;
   @OriginalMember(
      owner = "client!vt",
      name = "b",
      descriptor = "I"
   )
   public static int field2036;
   @OriginalMember(
      owner = "client!vt",
      name = "h",
      descriptor = "I"
   )
   public static int field2037;
   @OriginalMember(
      owner = "client!vt",
      name = "i",
      descriptor = "I"
   )
   public static int field2038;
   @OriginalMember(
      owner = "client!vt",
      name = "d",
      descriptor = "I"
   )
   public static int field2039;
   @OriginalMember(
      owner = "client!vt",
      name = "k",
      descriptor = "I"
   )
   public static int field2040;
   @OriginalMember(
      owner = "client!vt",
      name = "g",
      descriptor = "I"
   )
   public static int field2041;
   @OriginalMember(
      owner = "client!vt",
      name = "c",
      descriptor = "I"
   )
   public static int field2042;

   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1300(int arg0) {
      try {
         if (arg0 <= -16) {
            ++field2042;
            class107 var2 = this.field2035;
            synchronized(this.field2035) {
               this.field2035.method1045(3);
            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2046[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method1301(int arg0, int arg1) {
      try {
         class107 var3 = this.field2035;
         synchronized(this.field2035) {
            this.field2035.method1048(arg1, -8543);
         }

         if (arg0 != -706) {
            this.method1300(-19);
         }

         ++field2041;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field2046[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "(BI)Lou;"
   )
   public final class299 method1302(byte arg0, int arg1) {
      try {
         ++field2037;
         class107 var3 = this.field2035;
         class299 var4;
         synchronized(this.field2035) {
            var4 = (class299)this.field2035.method1041((long)arg1, 8);
         }

         if (var4 != null) {
            return var4;
         } else {
            class39 var5 = this.field2043;
            byte[] var6;
            synchronized(this.field2043) {
               var6 = this.field2043.method460((byte)-11, arg1, 32);
            }

            class299 var7 = new class299();
            var7.field4442 = this;
            if (var6 != null) {
               var7.method2481(false, new class65(var6));
            }

            class107 var8 = this.field2035;
            synchronized(this.field2035) {
               this.field2035.method1050(-126, var7, (long)arg1);
            }

            if (arg0 != -5) {
               this.field2043 = null;
            }

            return var7;
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field2046[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method1303(int arg0) {
      try {
         class94.field1536 = -2;
         class771.field11103 = -2;
         ++field2039;
         class528.field7463 = arg0;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2046[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method1304(boolean arg0) {
      try {
         if (!arg0) {
            ++field2040;
            class107 var2 = this.field2035;
            synchronized(this.field2035) {
               this.field2035.method1052(true);
            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2046[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "a",
      descriptor = "(IILuf;)V"
   )
   public static final void method1305(int arg0, int arg1, class33 arg2) {
      try {
         ++field2036;
         if (~class501.field7151 > -51) {
            if (arg2 != null && arg2.field490 != null && arg2.field490.length > arg1 && arg2.field490[arg1] != null) {
               if (arg0 == 1621035944) {
                  int var3 = arg2.field490[arg1][0];
                  int var4 = var3 >> 8;
                  if (~arg2.field490[arg1].length < -2) {
                     int var5 = (int)((double)arg2.field490[arg1].length * Math.random());
                     if (var5 > 0) {
                        var4 = arg2.field490[arg1][var5];
                     }
                  }

                  int var6 = (var3 & 229) >> 5;
                  int var7 = 256;
                  if (arg2.field465 != null && arg2.field475 != null) {
                     var7 = class133.method1369((byte)121, arg2.field465[arg1], arg2.field475[arg1]);
                  }

                  if (arg2.field469) {
                     class423.method3293(255, var7, (byte)4, 0, false, var6, var4);
                  } else {
                     class314.method2557(0, true, var4, var7, 255, var6);
                  }
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field2046[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2046[2] : field2046[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "<init>",
      descriptor = "(Ltb;ILsa;Lwh;)V"
   )
   public class127(class392 arg0, int arg1, class39 arg2, class350 arg3) {
      try {
         this.field2043 = arg2;
         this.field2043.method434((byte)-106, 32);
         this.field2044 = arg3;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field2046[0] + (arg0 != null ? field2046[2] : field2046[1]) + ',' + arg1 + ',' + (arg2 != null ? field2046[2] : field2046[1]) + ',' + (arg3 != null ? field2046[2] : field2046[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1306(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1307(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 121;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
