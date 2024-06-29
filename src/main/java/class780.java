import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class780 {
   @OriginalMember(
      owner = "client!rf",
      name = "p",
      descriptor = "Z"
   )
   private boolean field11423 = false;
   @OriginalMember(
      owner = "client!rf",
      name = "i",
      descriptor = "I"
   )
   private int field11422 = -1;
   @OriginalMember(
      owner = "client!rf",
      name = "n",
      descriptor = "[Ljava/lang/String;"
   )
   private String[] field11428 = new String[0];
   @OriginalMember(
      owner = "client!rf",
      name = "d",
      descriptor = "I"
   )
   private int field11429;
   @OriginalMember(
      owner = "client!rf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11439 = new String[]{method5672(method5671("\u0016k307")), method5672(method5671("\u0016k337")), method5672(method5671("\u0016k347")), method5672(method5671("\u001f#3\\b")), method5672(method5671("\nxq\u001e")), method5672(method5671("\u0016k377")), method5672(method5671("H-")), method5672(method5671("\u0016k3\u0006p7yo\u001bq\u0003%")), method5672(method5671("\u0016k317")), method5672(method5671("\u0016k3Nv\ndiL7")), method5672(method5671("\u0016k357")), method5672(method5671("\u0016k367")), method5672(method5671("\u0016k3:7"))};
   @OriginalMember(
      owner = "client!rf",
      name = "a",
      descriptor = "Luk;"
   )
   public static class498 field11434 = new class498(7, 6);
   @OriginalMember(
      owner = "client!rf",
      name = "k",
      descriptor = "I"
   )
   public static int field11438 = -1;
   @OriginalMember(
      owner = "client!rf",
      name = "o",
      descriptor = "[J"
   )
   public static long[] field11437 = new long[32];
   @OriginalMember(
      owner = "client!rf",
      name = "l",
      descriptor = "D"
   )
   public static double field11435;
   @OriginalMember(
      owner = "client!rf",
      name = "h",
      descriptor = "I"
   )
   public static int field11424;
   @OriginalMember(
      owner = "client!rf",
      name = "m",
      descriptor = "I"
   )
   public static int field11425;
   @OriginalMember(
      owner = "client!rf",
      name = "b",
      descriptor = "I"
   )
   public static int field11426;
   @OriginalMember(
      owner = "client!rf",
      name = "q",
      descriptor = "I"
   )
   public static int field11427;
   @OriginalMember(
      owner = "client!rf",
      name = "e",
      descriptor = "I"
   )
   public static int field11430;
   @OriginalMember(
      owner = "client!rf",
      name = "f",
      descriptor = "I"
   )
   public static int field11431;
   @OriginalMember(
      owner = "client!rf",
      name = "c",
      descriptor = "I"
   )
   public static int field11432;
   @OriginalMember(
      owner = "client!rf",
      name = "j",
      descriptor = "I"
   )
   public static int field11433;
   @OriginalMember(
      owner = "client!rf",
      name = "g",
      descriptor = "Ljq;"
   )
   public static class672 field11436;

   @OriginalMember(
      owner = "client!rf",
      name = "b",
      descriptor = "(I)[Ljava/lang/String;"
   )
   public final String[] method5663(int arg0) {
      try {
         ++field11424;
         String[] var2 = new String[this.field11422 + 1];
         class107.method1022(this.field11428, 0, var2, 0, this.field11422 + 1);
         if (arg0 != 20257) {
            method5668(48);
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11439[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rf",
      name = "a",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public final void method5664(String arg0, int arg1) {
      try {
         this.method5669(this.field11422 + 1, (byte)56, arg0);
         if (arg1 == -6113) {
            ++field11432;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11439[8] + (arg0 != null ? field11439[3] : field11439[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rf",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method5665(int arg0, int arg1) {
      try {
         class354.field5389 = arg0;
         ++field11425;
         class230.field3525 = -1;
         class177.field2774 = -1;
         if (arg1 <= 75) {
            field11436 = null;
         }

         class240.method2043(-1);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11439[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rf",
      name = "a",
      descriptor = "(BI)V"
   )
   private final void method5666(byte arg0, int arg1) {
      try {
         if (arg0 == -73) {
            ++field11430;
            String[] var3 = new String[this.method5667((byte)16, arg1)];
            class107.method1022(this.field11428, 0, var3, 0, this.field11428.length);
            this.field11428 = var3;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field11439[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rf",
      name = "b",
      descriptor = "(BI)I"
   )
   private final int method5667(byte arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field11426;
         if (arg0 != 16) {
            return -106;
         } else {
            int var4 = this.field11428.length;
            int var10000;
            if (var3) {
               var10000 = this.field11423;
            } else if (~var4 < ~arg1) {
               var10000 = var4;
               if (!var3) {
                  return var4;
               }
            } else {
               var10000 = this.field11423;
            }

            while(true) {
               if (var10000 != 0) {
                  if (~var4 != -1) {
                     var4 = this.field11429 * var4;
                     if (var3) {
                        var4 = 1;
                        if (var3) {
                           var4 += this.field11429;
                        }
                     }
                  } else {
                     var4 = 1;
                     if (var3) {
                        var4 += this.field11429;
                     }
                  }
               } else {
                  var4 += this.field11429;
               }

               if (~var4 < ~arg1) {
                  var10000 = var4;
                  if (!var3) {
                     return var4;
                  }
               } else {
                  var10000 = this.field11423;
               }
            }
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field11439[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rf",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5668(int arg0) {
      try {
         field11437 = null;
         int var1 = 63 % ((arg0 - 65) / 56);
         field11434 = null;
         field11436 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11439[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rf",
      name = "a",
      descriptor = "(IBLjava/lang/String;)V"
   )
   private final void method5669(int arg0, byte arg1, String arg2) {
      try {
         if (~this.field11422 > ~arg0) {
            this.field11422 = arg0;
         }

         ++field11433;
         if (arg1 == 56) {
            if (arg0 >= this.field11428.length) {
               this.method5666((byte)-73, arg0);
            }

            this.field11428[arg0] = arg2;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field11439[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11439[3] : field11439[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rf",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      boolean var1 = client.field1786;

      try {
         ++field11427;
         StringBuffer var2 = new StringBuffer();
         var2.append("[");
         int var3 = 0;
         if (var1) {
            if (var3 != 0) {
               var2.append(field11439[6]);
            }

            var2.append(this.field11428[var3]);
            ++var3;
         }

         while(true) {
            while(~var3 > ~this.field11422) {
               if (var3 != 0) {
                  var2.append(field11439[6]);
               }

               var2.append(this.field11428[var3]);
               ++var3;
            }

            var2.append("]");
            if (!var1) {
               return var2.toString();
            }

            ++var3;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field11439[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rf",
      name = "a",
      descriptor = "([SII)[S"
   )
   public static final short[] method5670(short[] arg0, int arg1, int arg2) {
      try {
         ++field11431;
         if (arg1 != 1) {
            return null;
         } else {
            short[] var3 = new short[arg2];
            class107.method1024(arg0, 0, var3, 0, arg2);
            return var3;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field11439[12] + (arg0 != null ? field11439[3] : field11439[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rf",
      name = "<init>",
      descriptor = "(IZ)V"
   )
   public class780(int arg0, boolean arg1) {
      try {
         this.field11429 = arg0;
         this.field11423 = arg1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11439[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5671(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5672(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 100;
            break;
         case 1:
            var10005 = 13;
            break;
         case 2:
            var10005 = 29;
            break;
         case 3:
            var10005 = 114;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
