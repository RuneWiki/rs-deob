import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class388 {
   @OriginalMember(
      owner = "client!pa",
      name = "q",
      descriptor = "[Ljava/lang/String;"
   )
   private String[] field5922 = new String[0];
   @OriginalMember(
      owner = "client!pa",
      name = "n",
      descriptor = "I"
   )
   private int field5932 = -1;
   @OriginalMember(
      owner = "client!pa",
      name = "e",
      descriptor = "Z"
   )
   private boolean field5937 = false;
   @OriginalMember(
      owner = "client!pa",
      name = "p",
      descriptor = "I"
   )
   private int field5924;
   @OriginalMember(
      owner = "client!pa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5941 = new String[]{method2985(method2984("k\bx&")), method2985(method2984("~S:dy")), method2985(method2984("u\u001c:\u0002,")), method2985(method2984("u\u001c:\t,")), method2985(method2984("u\u001c:\r,")), method2985(method2984("v\u0016")), method2985(method2984("u\u001c:\f,")), method2985(method2984("s\u0017")), method2985(method2984("u\u001c:\u000b,")), method2985(method2984("u\u001c:vmk\u0014`t,")), method2985(method2984("u\u001c:\u0003,")), method2985(method2984("u\u001c:>kV\tf#jbU")), method2985(method2984(")]")), method2985(method2984("u\u001c:\u000e,")), method2985(method2984("u\u001c:\b,")), method2985(method2984("u\u001c:\u000f,"))};
   @OriginalMember(
      owner = "client!pa",
      name = "l",
      descriptor = "[Lmba;"
   )
   public static class441[] field5931 = new class441[14];
   @OriginalMember(
      owner = "client!pa",
      name = "h",
      descriptor = "Lsd;"
   )
   public static class101 field5933 = new class101(11, 7);
   @OriginalMember(
      owner = "client!pa",
      name = "k",
      descriptor = "I"
   )
   public static int field5934 = -1;
   @OriginalMember(
      owner = "client!pa",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field5935 = false;
   @OriginalMember(
      owner = "client!pa",
      name = "m",
      descriptor = "I"
   )
   public static int field5923;
   @OriginalMember(
      owner = "client!pa",
      name = "i",
      descriptor = "I"
   )
   public static int field5925;
   @OriginalMember(
      owner = "client!pa",
      name = "f",
      descriptor = "I"
   )
   public static int field5926;
   @OriginalMember(
      owner = "client!pa",
      name = "j",
      descriptor = "I"
   )
   public static int field5927;
   @OriginalMember(
      owner = "client!pa",
      name = "g",
      descriptor = "I"
   )
   public static int field5928;
   @OriginalMember(
      owner = "client!pa",
      name = "o",
      descriptor = "I"
   )
   public static int field5929;
   @OriginalMember(
      owner = "client!pa",
      name = "c",
      descriptor = "I"
   )
   public static int field5930;
   @OriginalMember(
      owner = "client!pa",
      name = "s",
      descriptor = "I"
   )
   public static int field5936;
   @OriginalMember(
      owner = "client!pa",
      name = "d",
      descriptor = "I"
   )
   public static int field5938;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!pa",
      name = "a",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field5939;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!pa",
      name = "r",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field5940;

   @OriginalMember(
      owner = "client!pa",
      name = "a",
      descriptor = "(Ljava/lang/String;II)V"
   )
   private final void method2974(String arg0, int arg1, int arg2) {
      try {
         ++field5929;
         if (~arg1 < ~this.field5932) {
            this.field5932 = arg1;
         }

         if (this.field5922.length <= arg1) {
            this.method2979(arg1, 0);
         }

         if (arg2 == 27361) {
            this.field5922[arg1] = arg0;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5941[2] + (arg0 != null ? field5941[1] : field5941[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pa",
      name = "a",
      descriptor = "(B)[Ljava/lang/String;"
   )
   public final String[] method2975(byte arg0) {
      try {
         if (arg0 <= 14) {
            this.method2981(-53, (byte)-7);
         }

         ++field5927;
         String[] var2 = new String[this.field5932 + 1];
         class195.method1496(this.field5922, 0, var2, 0, this.field5932 - -1);
         return var2;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5941[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pa",
      name = "b",
      descriptor = "(I)I"
   )
   public static final int method2976(int arg0) {
      int var1 = client.field4530;

      try {
         ++field5936;
         int var2 = 0;
         Field[] var3 = (field5939 != null ? field5939 : (field5939 = method2983(field5941[5]))).getDeclaredFields();
         if (arg0 != -8894) {
            field5935 = true;
         }

         Field[] var4 = var3;
         int var5 = 0;
         if (var1 == 0 && var3.length <= var5) {
            return var2 - -1;
         } else {
            do {
               Field var6 = var4[var5];
               if ((field5940 != null ? field5940 : (field5940 = method2983(field5941[7]))).isAssignableFrom(var6.getType())) {
                  ++var2;
               }

               ++var5;
            } while(var4.length > var5);

            return var2 - -1;
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field5941[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pa",
      name = "a",
      descriptor = "(Ljj;B)Lhda;"
   )
   public static final class781 method2977(class128 arg0, byte arg1) {
      try {
         ++field5928;
         if (arg1 >= -113) {
            method2978(true, 42);
         }

         return new class781(arg0.method1066(32767), arg0.method1066(32767), arg0.method1066(32767), arg0.method1066(32767), arg0.method1077(-33), arg0.method1077(-33), arg0.method1104(255));
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5941[4] + (arg0 != null ? field5941[1] : field5941[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pa",
      name = "a",
      descriptor = "(ZI)I"
   )
   public static final int method2978(boolean arg0, int arg1) {
      try {
         ++field5926;
         if (!arg0) {
            field5935 = false;
         }

         int var2 = arg1 & 63;
         int var3 = (arg1 & 194) >> 6;
         if (var2 != 18) {
            if (~var2 == -20 || var2 == 21) {
               if (var3 == 0) {
                  return 16;
               }

               if (var3 == 1) {
                  return 32;
               }

               if (var3 == 2) {
                  return 64;
               }

               if (var3 == 3) {
                  return 128;
               }
            }
         } else {
            if (var3 == 0) {
               return 1;
            }

            if (var3 == 1) {
               return 2;
            }

            if (var3 == 2) {
               return 4;
            }

            if (~var3 == -4) {
               return 8;
            }
         }

         return 0;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5941[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pa",
      name = "a",
      descriptor = "(II)V"
   )
   private final void method2979(int arg0, int arg1) {
      try {
         ++field5938;
         String[] var3 = new String[this.method2981(arg0, (byte)105)];
         class195.method1496(this.field5922, 0, var3, arg1, this.field5922.length);
         this.field5922 = var3;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5941[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pa",
      name = "a",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public final void method2980(String arg0, int arg1) {
      try {
         this.method2974(arg0, this.field5932 + arg1, arg1 ^ 27360);
         ++field5923;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5941[15] + (arg0 != null ? field5941[1] : field5941[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pa",
      name = "a",
      descriptor = "(IB)I"
   )
   private final int method2981(int arg0, byte arg1) {
      int var3 = client.field4530;

      try {
         ++field5930;
         if (arg1 < 68) {
            this.method2981(-21, (byte)112);
         }

         int var4 = this.field5922.length;
         int var10000;
         if (var3 != 0) {
            var10000 = this.field5937;
         } else if (~arg0 > ~var4) {
            var10000 = var4;
            if (var3 == 0) {
               return var4;
            }
         } else {
            var10000 = this.field5937;
         }

         while(true) {
            if (var10000 == 0) {
               var4 += this.field5924;
               if (var3 != 0) {
                  if (~var4 == -1) {
                     var4 = 1;
                     if (var3 != 0) {
                        var4 = this.field5924 * var4;
                     }
                  } else {
                     var4 = this.field5924 * var4;
                  }
               }
            } else if (~var4 == -1) {
               var4 = 1;
               if (var3 != 0) {
                  var4 = this.field5924 * var4;
               }
            } else {
               var4 = this.field5924 * var4;
            }

            if (~arg0 > ~var4) {
               var10000 = var4;
               if (var3 == 0) {
                  return var4;
               }
            } else {
               var10000 = this.field5937;
            }
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field5941[14] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2982(int arg0) {
      try {
         if (arg0 != 2671) {
            method2982(58);
         }

         field5931 = null;
         field5933 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5941[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pa",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      int var1 = client.field4530;

      try {
         ++field5925;
         StringBuffer var2 = new StringBuffer();
         var2.append("[");
         int var3 = 0;
         if (var1 != 0) {
            if (~var3 != -1) {
               var2.append(field5941[12]);
            }

            var2.append(this.field5922[var3]);
            ++var3;
         }

         while(true) {
            while(~this.field5932 < ~var3) {
               if (~var3 != -1) {
                  var2.append(field5941[12]);
               }

               var2.append(this.field5922[var3]);
               ++var3;
            }

            var2.append("]");
            if (var1 == 0) {
               return var2.toString();
            }

            ++var3;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5941[11] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pa",
      name = "<init>",
      descriptor = "(IZ)V"
   )
   public class388(int arg0, boolean arg1) {
      try {
         this.field5924 = arg0;
         this.field5937 = arg1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5941[9] + arg0 + ',' + arg1 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!pa",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method2983(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!pa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2984(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 4);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2985(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 5;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 4;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
