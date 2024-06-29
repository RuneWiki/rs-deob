import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class325 implements Runnable {
   @OriginalMember(
      owner = "client!gca",
      name = "b",
      descriptor = "Lsf;"
   )
   private class475 field4951;
   @OriginalMember(
      owner = "client!gca",
      name = "f",
      descriptor = "I"
   )
   public int field4954;
   @OriginalMember(
      owner = "client!gca",
      name = "j",
      descriptor = "Z"
   )
   private boolean field4955;
   @OriginalMember(
      owner = "client!gca",
      name = "h",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field4953;
   @OriginalMember(
      owner = "client!gca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4956 = new String[]{method2667(method2666("p7\u001c71i%")), method2667(method2666("z5\r}\u00185")), method2667(method2666("p7\u001c52|1")), method2667(method2666("r\"\u00046,q3\u001a62")), method2667(method2666("i?\u00016,\u007f7\u001e\f:x0\r&2i")), method2667(method2666("~9\u0001#?n%")), method2667(method2666("u?\u0002'\u0001p7\u001c6:z3")), method2667(method2666("s7\u00016\u0001t5\u0003=-")), method2667(method2666("u3\r77~9\u0002 \u0001m$\r*;o")), method2667(method2666("n5\u001e<2q4\r!")), method2667(method2666("u?\u0002'\u0001u3\r77~9\u0002 ")), method2667(method2666("fxB}#")), method2667(method2666("u?\u0018>?o=\u001f")), method2667(method2666("u?\u00181?o\t\b68|#\u0000'")), method2667(method2666("{:\u0003<,n>\r71j%")), method2667(method2666("u3\r77~9\u0002 \u0001m=")), method2667(method2666("u?\u0002'\u0001p7\u001c>?o=\t!-")), method2667(method2666("~$\u0003 -")), method2667(method2666("s#\u0000?")), method2667(method2666("z5\r}\u001b5")), method2667(method2666("z5\r}\u00175")), method2667(method2666("z5\r}\u00195")), method2667(method2666("z5\r}\u00145")), method2667(method2666("z5\r}\u001f5")), method2667(method2666("z5\r}bt8\u0005'`5")), method2667(method2666("z5\r}\u001c5")), method2667(method2666("z5\r},h8D")), method2667(method2666("z5\r}\u001a5")), method2667(method2666("z5\r}\u00165"))};
   @OriginalMember(
      owner = "client!gca",
      name = "i",
      descriptor = "Luk;"
   )
   public static class498 field4944 = new class498(94, 2);
   @OriginalMember(
      owner = "client!gca",
      name = "g",
      descriptor = "I"
   )
   public static int field4941;
   @OriginalMember(
      owner = "client!gca",
      name = "d",
      descriptor = "I"
   )
   public static int field4942;
   @OriginalMember(
      owner = "client!gca",
      name = "n",
      descriptor = "I"
   )
   public static int field4943;
   @OriginalMember(
      owner = "client!gca",
      name = "k",
      descriptor = "I"
   )
   public static int field4945;
   @OriginalMember(
      owner = "client!gca",
      name = "l",
      descriptor = "I"
   )
   public static int field4946;
   @OriginalMember(
      owner = "client!gca",
      name = "o",
      descriptor = "I"
   )
   public static int field4947;
   @OriginalMember(
      owner = "client!gca",
      name = "e",
      descriptor = "I"
   )
   public static int field4948;
   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "I"
   )
   public static int field4949;
   @OriginalMember(
      owner = "client!gca",
      name = "c",
      descriptor = "I"
   )
   public static int field4950;
   @OriginalMember(
      owner = "client!gca",
      name = "m",
      descriptor = "I"
   )
   public static int field4952;

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(I[B)V"
   )
   public static final void method2656(int arg0, byte[] arg1) {
      boolean var2 = client.field1786;

      try {
         ++field4948;
         class354 var3 = new class354(arg1);
         boolean var4 = false;

         int var5;
         label105:
         while(true) {
            label103:
            while(true) {
               var5 = var3.method2855(arg0 ^ 31006);
               if (var5 == 0) {
                  if (var2) {
                     break;
                  }

                  if (!var2) {
                     break label105;
                  }
               }

               if (var5 == 1) {
                  if (class675.field10051 == null) {
                     class675.field10051 = new int[4];
                     class522.field7960 = new int[4];
                     class573.field8488 = 4;
                  }

                  int var6 = 0;
                  if (var2) {
                     class675.field10051[var6] = var3.method2869(false);
                     class522.field7960[var6] = var3.method2869(false);
                     ++var6;
                  }

                  while(true) {
                     while(class675.field10051.length > var6) {
                        class675.field10051[var6] = var3.method2869(false);
                        class522.field7960[var6] = var3.method2869(false);
                        ++var6;
                     }

                     var4 = true;
                     if (!var2) {
                        if (!var2) {
                           continue label103;
                        }
                        break label103;
                     }

                     ++var6;
                  }
               }
               break;
            }

            if (~var5 == -3) {
               class650.field9378 = var3.method2848(arg0 + -113);
               if (!var2) {
                  continue;
               }
            }

            if (var5 == 3) {
               class573.field8488 = var3.method2855(-31007);
               class675.field10051 = new int[class573.field8488];
               class522.field7960 = new int[class573.field8488];
               if (!var2) {
                  continue;
               }
            }

            if (var5 != 5) {
               if (var5 != 6) {
                  continue;
               }

               class441.field6789 = var3.method2872(2);
               if (!var2) {
                  continue;
               }
            }

            class728.field10872 = var3.method2872(2);
            if (var2) {
               break;
            }
         }

         if (!var4) {
            if (class675.field10051 == null) {
               class675.field10051 = new int[4];
               class573.field8488 = 4;
               class522.field7960 = new int[4];
            }

            var5 = 0;
            if (var2) {
               class675.field10051[var5] = 0;
               class522.field7960[var5] = var5 * 20;
               ++var5;
            }
         } else {
            if (!var2) {
               if (arg0 != -1) {
                  method2657(-123, 59, 126, 98);
                  return;
               }

               return;
            }

            ++var5;
         }

         while(true) {
            while(var5 < class675.field10051.length) {
               class675.field10051[var5] = 0;
               class522.field7960[var5] = var5 * 20;
               ++var5;
            }

            if (!var2) {
               if (arg0 != -1) {
                  method2657(-123, 59, 126, 98);
                  return;
               }

               return;
            }

            ++var5;
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field4956[21] + arg0 + ',' + (arg1 != null ? field4956[11] : field4956[18]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(IIII)V"
   )
   public static final void method2657(int arg0, int arg1, int arg2, int arg3) {
      class190 var4 = class711.field10694[arg0][arg1][arg2];
      if (var4 != null) {
         class484 var5 = var4.field2953;
         class484 var6 = var4.field2951;
         if (var5 != null) {
            var5.field7364 = (short)(var5.field7364 * arg3 / (16 << class394.field6180 - 7));
            var5.field7372 = (short)(var5.field7372 * arg3 / (16 << class394.field6180 - 7));
         }

         if (var6 != null) {
            var6.field7364 = (short)(var6.field7364 * arg3 / (16 << class394.field6180 - 7));
            var6.field7372 = (short)(var6.field7372 * arg3 / (16 << class394.field6180 - 7));
         }

      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(BZII)I"
   )
   public static final int method2658(byte arg0, boolean arg1, int arg2, int arg3) {
      try {
         ++field4952;
         class503 var4 = class291.method2454(arg1, (byte)-26, arg2);
         if (var4 == null) {
            return 0;
         } else if (arg0 != 9) {
            return -18;
         } else {
            return ~arg3 <= -1 && ~arg3 > ~var4.field7681.length ? var4.field7681[arg3] : 0;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4956[28] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method2659(boolean arg0) {
      try {
         ++field4950;
         this.field4955 = true;
         class475 var2 = this.field4951;
         synchronized(this.field4951) {
            this.field4951.notifyAll();
         }

         if (arg0) {
            this.method2660((byte[])null, 68, (class11)null, 14);
         }

         try {
            this.field4953.join();
         } catch (InterruptedException var4) {
         }

         this.field4953 = null;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4956[20] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "([BILlt;I)Luea;"
   )
   public final class339 method2660(byte[] arg0, int arg1, class11 arg2, int arg3) {
      try {
         ++field4949;
         class339 var5 = new class339();
         var5.field5184 = arg2;
         var5.field5186 = 2;
         var5.field8288 = false;
         var5.field4684 = (long)arg1;
         var5.field5187 = arg0;
         if (arg3 <= 13) {
            this.method2660((byte[])null, 75, (class11)null, 81);
         }

         this.method2663(var5, 5);
         return var5;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field4956[27] + (arg0 != null ? field4956[11] : field4956[18]) + ',' + arg1 + ',' + (arg2 != null ? field4956[11] : field4956[18]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(IILlt;)Luea;"
   )
   public final class339 method2661(int param1, int param2, class11 param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gca",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2662(byte arg0) {
      try {
         if (arg0 >= -38) {
            method2656(8, (byte[])null);
         }

         field4944 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4956[23] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(Luea;I)V"
   )
   private final void method2663(class339 arg0, int arg1) {
      try {
         ++field4943;
         class475 var3 = this.field4951;
         synchronized(this.field4951) {
            if (arg1 != 5) {
               method2664((class678)null, (byte)12);
            }

            this.field4951.method3693(arg0, true);
            ++this.field4954;
            this.field4951.notifyAll();
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4956[25] + (arg0 != null ? field4956[11] : field4956[18]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(Lrr;B)V"
   )
   public static final void method2664(class678 arg0, byte arg1) {
      try {
         class760.field11235 = arg0.method4999(field4956[12], (byte)97);
         ++field4942;
         class450.field6887 = arg0.method4999(field4956[13], (byte)73);
         class485.field7381 = arg0.method4999(field4956[4], (byte)39);
         class680.field10147 = arg0.method4999(field4956[15], (byte)59);
         class213.field3241 = arg0.method4999(field4956[8], (byte)51);
         class670.field9995 = arg0.method4999(field4956[10], (byte)47);
         if (arg1 != -88) {
            method2657(-25, 120, -55, -102);
         }

         class120.field1702 = arg0.method4999(field4956[16], (byte)38);
         class233.field3575 = arg0.method4999(field4956[2], (byte)101);
         class234.field3580 = arg0.method4999(field4956[17], (byte)81);
         class41.field544 = arg0.method4999(field4956[0], (byte)123);
         class695.field10324 = arg0.method4999(field4956[9], (byte)47);
         class91.field1307 = arg0.method4999(field4956[7], (byte)109);
         class11.field140 = arg0.method4999(field4956[14], (byte)119);
         class376.field5982 = arg0.method4999(field4956[5], (byte)71);
         class395.field6186 = arg0.method4999(field4956[3], (byte)74);
         class427.field6589 = arg0.method4999(field4956[6], (byte)102);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4956[1] + (arg0 != null ? field4956[11] : field4956[18]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(Llt;II)Luea;"
   )
   public final class339 method2665(class11 arg0, int arg1, int arg2) {
      try {
         ++field4941;
         class339 var4 = new class339();
         var4.field5186 = 3;
         if (arg1 != -5227) {
            method2662((byte)7);
         }

         var4.field4684 = (long)arg2;
         var4.field5184 = arg0;
         var4.field8288 = false;
         this.method2663(var4, 5);
         return var4;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4956[22] + (arg0 != null ? field4956[11] : field4956[18]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "<init>",
      descriptor = "(Lsu;)V"
   )
   public class325(class289 arg0) {
      boolean var2 = client.field1786;
      super();
      this.field4951 = new class475();
      this.field4954 = 0;
      this.field4955 = false;

      try {
         class275 var3 = arg0.method2442(this, false, 5);
         if (var2) {
            class697.method5128(10L, -102);
         }

         while(~var3.field4398 == -1) {
            class697.method5128(10L, -102);
         }

         if (var3.field4398 == 2) {
            throw new RuntimeException();
         } else {
            this.field4953 = (Thread)var3.field4401;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4956[24] + (arg0 != null ? field4956[11] : field4956[18]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2666(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 94);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2667(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 29;
            break;
         case 1:
            var10005 = 86;
            break;
         case 2:
            var10005 = 108;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 94;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
