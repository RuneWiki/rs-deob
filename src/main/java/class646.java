import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class646 {
   @OriginalMember(
      owner = "client!of",
      name = "l",
      descriptor = "[Ljava/lang/String;"
   )
   private String[] field9388 = new String[0];
   @OriginalMember(
      owner = "client!of",
      name = "h",
      descriptor = "Z"
   )
   private boolean field9386 = false;
   @OriginalMember(
      owner = "client!of",
      name = "e",
      descriptor = "I"
   )
   private int field9395 = -1;
   @OriginalMember(
      owner = "client!of",
      name = "c",
      descriptor = "I"
   )
   private int field9392;
   @OriginalMember(
      owner = "client!of",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9397 = new String[]{method4750(method4749("5p\nYB")), method4750(method4749("5p\nZB")), method4750(method4749("4cHp")), method4750(method4749("!8\n2\u0017")), method4750(method4749("5p\n_B")), method4750(method4749("5p\n^B")), method4750(method4749("5p\nh\u0005\tbVu\u0004=>")), method4750(method4749("v6")), method4750(method4749("5p\n \u00034\u007fP\"B")), method4750(method4749("5p\n]B")), method4750(method4749("5p\nXB"))};
   @OriginalMember(
      owner = "client!of",
      name = "a",
      descriptor = "I"
   )
   public static int field9391 = -50;
   @OriginalMember(
      owner = "client!of",
      name = "g",
      descriptor = "I"
   )
   public static int field9385;
   @OriginalMember(
      owner = "client!of",
      name = "f",
      descriptor = "I"
   )
   public static int field9387;
   @OriginalMember(
      owner = "client!of",
      name = "i",
      descriptor = "I"
   )
   public static int field9389;
   @OriginalMember(
      owner = "client!of",
      name = "b",
      descriptor = "I"
   )
   public static int field9390;
   @OriginalMember(
      owner = "client!of",
      name = "d",
      descriptor = "I"
   )
   public static int field9393;
   @OriginalMember(
      owner = "client!of",
      name = "j",
      descriptor = "I"
   )
   public static int field9394;
   @OriginalMember(
      owner = "client!of",
      name = "k",
      descriptor = "I"
   )
   public static int field9396;

   @OriginalMember(
      owner = "client!of",
      name = "a",
      descriptor = "(ILjava/lang/String;)V",
      line = 9
   )
   public final void method4743(int arg0, String arg1) {
      try {
         this.method4744(-1, this.field9395 + 1, arg1);
         if (arg0 != -25162) {
            this.toString();
         }

         ++field9389;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9397[9] + arg0 + ',' + (arg1 != null ? field9397[3] : field9397[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!of",
      name = "<init>",
      descriptor = "(IZ)V",
      line = 154
   )
   public class646(int arg0, boolean arg1) {
      try {
         this.field9392 = arg0;
         this.field9386 = arg1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9397[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!of",
      name = "a",
      descriptor = "(IILjava/lang/String;)V",
      line = 26
   )
   private final void method4744(int arg0, int arg1, String arg2) {
      try {
         if (this.field9395 < arg1) {
            this.field9395 = arg1;
         }

         ++field9394;
         if (arg0 != -1) {
            this.field9392 = 63;
         }

         if (~arg1 <= ~this.field9388.length) {
            this.method4748(arg1, 0);
         }

         this.field9388[arg1] = arg2;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field9397[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9397[3] : field9397[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!of",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 43
   )
   public final String toString() {
      boolean var1 = client.field4564;

      try {
         ++field9387;
         StringBuffer var2 = new StringBuffer();
         var2.append("[");
         int var3 = 0;
         if (var1) {
            if (var3 != 0) {
               var2.append(field9397[7]);
            }

            var2.append(this.field9388[var3]);
            ++var3;
         }

         while(true) {
            while(~var3 > ~this.field9395) {
               if (var3 != 0) {
                  var2.append(field9397[7]);
               }

               var2.append(this.field9388[var3]);
               ++var3;
            }

            var2.append("]");
            if (!var1) {
               return var2.toString();
            }

            ++var3;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field9397[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!of",
      name = "a",
      descriptor = "(I)[Ljava/lang/String;",
      line = 72
   )
   public final String[] method4745(int arg0) {
      try {
         if (arg0 != 8555) {
            return null;
         } else {
            ++field9390;
            String[] var2 = new String[this.field9395 + 1];
            class365.method2853(this.field9388, 0, var2, 0, this.field9395 + 1);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9397[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!of",
      name = "b",
      descriptor = "(II)I",
      line = 86
   )
   private final int method4746(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field9385;
         int var4 = this.field9388.length;
         if (var3) {
            if (!this.field9386) {
               var4 += this.field9392;
               if (var3) {
                  if (var4 == 0) {
                     var4 = 1;
                     if (var3) {
                        var4 *= this.field9392;
                     }
                  } else {
                     var4 *= this.field9392;
                  }
               }
            } else if (var4 == 0) {
               var4 = 1;
               if (var3) {
                  var4 *= this.field9392;
               }
            } else {
               var4 *= this.field9392;
            }
         }

         while(true) {
            while(var4 <= arg1) {
               if (!this.field9386) {
                  var4 += this.field9392;
                  if (var3) {
                     if (var4 == 0) {
                        var4 = 1;
                        if (var3) {
                           var4 *= this.field9392;
                        }
                     } else {
                        var4 *= this.field9392;
                     }
                  }
               } else if (var4 == 0) {
                  var4 = 1;
                  if (var3) {
                     var4 *= this.field9392;
                  }
               } else {
                  var4 *= this.field9392;
               }
            }

            if (!var3) {
               if (arg0 > -96) {
                  this.method4748(85, 74);
               }

               return var4;
            }

            var4 = arg0 * -96;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field9397[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!of",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;Ld;III)Lha;",
      line = 117
   )
   public static final class65 method4747(Canvas arg0, class160 arg1, int arg2, int arg3, int arg4) {
      try {
         ++field9396;
         return arg2 != -1 ? null : new class721(arg0, arg1, arg3, arg4);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field9397[5] + (arg0 != null ? field9397[3] : field9397[2]) + ',' + (arg1 != null ? field9397[3] : field9397[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!of",
      name = "a",
      descriptor = "(II)V",
      line = 135
   )
   private final void method4748(int arg0, int arg1) {
      try {
         ++field9393;
         String[] var3 = new String[this.method4746(arg1 + -115, arg0)];
         class365.method2853(this.field9388, 0, var3, arg1, this.field9388.length);
         this.field9388 = var3;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field9397[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!of",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4749(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 106);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!of",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4750(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 90;
            break;
         case 1:
            var10005 = 22;
            break;
         case 2:
            var10005 = 36;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 106;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
