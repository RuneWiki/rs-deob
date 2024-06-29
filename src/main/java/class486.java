import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public abstract class class486 implements class376 {
   @OriginalMember(
      owner = "client!sl",
      name = "f",
      descriptor = "Z"
   )
   private boolean field6937 = false;
   @OriginalMember(
      owner = "client!sl",
      name = "b",
      descriptor = "I"
   )
   public int field6938;
   @OriginalMember(
      owner = "client!sl",
      name = "o",
      descriptor = "Z"
   )
   private boolean field6932;
   @OriginalMember(
      owner = "client!sl",
      name = "e",
      descriptor = "I"
   )
   private int field6944;
   @OriginalMember(
      owner = "client!sl",
      name = "c",
      descriptor = "I"
   )
   public int field6948;
   @OriginalMember(
      owner = "client!sl",
      name = "i",
      descriptor = "Lea;"
   )
   public class573 field6940;
   @OriginalMember(
      owner = "client!sl",
      name = "p",
      descriptor = "I"
   )
   public int field6931;
   @OriginalMember(
      owner = "client!sl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6949 = new String[]{method3532(method3531("}\u001c7#N")), method3532(method3531("}\u001c7$N")), method3532(method3531("}\u001c7\u0016\u000f`\u0011u\u0019\u001ckX")), method3532(method3531("}\u001c7>N")), method3532(method3531("}\u001c7&N")), method3532(method3531("u^7^\u001b")), method3532(method3531("`\u0005u\u001c")), method3532(method3531("}\u001c7L\u000f`\u0019mNN")), method3532(method3531("}\u001c7=N")), method3532(method3531("}\u001c7?N")), method3532(method3531("}\u001c7'N")), method3532(method3531("}\u001c7%N")), method3532(method3531("}\u001c7 N")), method3532(method3531("}\u001c7!N")), method3532(method3531("}\u001c7\"N"))};
   @OriginalMember(
      owner = "client!sl",
      name = "k",
      descriptor = "Ljava/lang/Object;"
   )
   public static volatile Object field6936 = null;
   @OriginalMember(
      owner = "client!sl",
      name = "g",
      descriptor = "I"
   )
   public static int field6933;
   @OriginalMember(
      owner = "client!sl",
      name = "a",
      descriptor = "I"
   )
   public static int field6934;
   @OriginalMember(
      owner = "client!sl",
      name = "q",
      descriptor = "I"
   )
   public static int field6935;
   @OriginalMember(
      owner = "client!sl",
      name = "r",
      descriptor = "I"
   )
   public static int field6939;
   @OriginalMember(
      owner = "client!sl",
      name = "j",
      descriptor = "I"
   )
   public static int field6941;
   @OriginalMember(
      owner = "client!sl",
      name = "l",
      descriptor = "I"
   )
   public static int field6942;
   @OriginalMember(
      owner = "client!sl",
      name = "d",
      descriptor = "I"
   )
   public static int field6943;
   @OriginalMember(
      owner = "client!sl",
      name = "n",
      descriptor = "I"
   )
   public static int field6945;
   @OriginalMember(
      owner = "client!sl",
      name = "h",
      descriptor = "I"
   )
   public static int field6946;
   @OriginalMember(
      owner = "client!sl",
      name = "m",
      descriptor = "I"
   )
   public static int field6947;

   @OriginalMember(
      owner = "client!sl",
      name = "d",
      descriptor = "(B)V",
      line = 3
   )
   public static void method3520(byte arg0) {
      try {
         if (arg0 > 53) {
            field6936 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6949[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "b",
      descriptor = "(ZI)V",
      line = 13
   )
   public final void method3521(boolean arg0, int arg1) {
      try {
         ++field6943;
         if (this.field6932 != arg0) {
            int var3 = this.method3530(4);
            this.field6932 = true;
            this.method3525(0);
            this.method3523(var3, -3071);
         }

         if (arg1 != 10241) {
            this.method3522((byte)-93);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field6949[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "c",
      descriptor = "(B)V",
      line = 32
   )
   public final void method3522(byte arg0) {
      try {
         ++field6935;
         if (arg0 != -91) {
            this.field6948 = 27;
         }

         if (~this.field6931 < -1) {
            this.field6940.method4133(this.method3530(4), 771, this.field6931);
            this.field6931 = 0;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6949[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "a",
      descriptor = "(II)V",
      line = 49
   )
   private final void method3523(int arg0, int arg1) {
      try {
         ++field6942;
         this.field6940.field8368 -= arg0;
         if (arg1 == -3071) {
            this.field6940.field8368 += this.method3530(arg1 ^ -3067);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6949[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "b",
      descriptor = "(II)Lae;",
      line = 65
   )
   public static final class264 method3524(int arg0, int arg1) {
      try {
         ++field6933;
         if (arg0 > -79) {
            method3524(-26, -95);
         }

         if (arg1 != 0) {
            if (arg1 == 1) {
               return new class347();
            }

            if (arg1 == 2) {
               return new class41();
            }

            if (arg1 == 3) {
               return new class93();
            }

            if (arg1 == 4) {
               return new class407();
            }

            if (arg1 == 5) {
               return new class280();
            }

            if (~arg1 == -7) {
               return new class56();
            }

            if (~arg1 == -8) {
               return new class283();
            }

            if (arg1 == 8) {
               return new class132();
            }

            if (~arg1 == -10) {
               return new class178();
            }

            if (~arg1 == -11) {
               return new class52();
            }

            if (~arg1 == -12) {
               return new class434();
            }

            if (arg1 == 12) {
               return new class314();
            }

            if (arg1 == 13) {
               return new class684();
            }

            if (arg1 == 14) {
               return new class554();
            }

            if (~arg1 == -16) {
               return new class69();
            }

            if (~arg1 == -17) {
               return new class246();
            }

            if (~arg1 == -18) {
               return new class360();
            }

            if (~arg1 == -19) {
               return new class89();
            }

            if (~arg1 == -20) {
               return new class137();
            }

            if (~arg1 == -21) {
               return new class2();
            }

            if (~arg1 == -22) {
               return new class134();
            }

            if (~arg1 == -23) {
               return new class454();
            }

            if (arg1 == 23) {
               return new class189();
            }

            if (~arg1 == -25) {
               return new class61();
            }

            if (arg1 == 25) {
               return new class96();
            }

            if (~arg1 == -27) {
               return new class581();
            }

            if (arg1 == 27) {
               return new class109();
            }

            if (arg1 == 28) {
               return new class543();
            }

            if (~arg1 == -30) {
               return new class131();
            }

            if (arg1 == 30) {
               return new class82();
            }

            if (~arg1 == -32) {
               return new class746();
            }

            if (arg1 == 32) {
               return new class98();
            }

            if (~arg1 == -34) {
               return new class778();
            }

            if (arg1 == 34) {
               return new class641();
            }

            if (~arg1 == -36) {
               return new class510();
            }

            if (~arg1 == -37) {
               return new class740();
            }

            if (arg1 == 37) {
               return new class414();
            }

            if (~arg1 == -39) {
               return new class72();
            }

            if (~arg1 != -40) {
               return null;
            }

            if (!client.field4360) {
               return new class45();
            }
         }

         return new class103();
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6949[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "c",
      descriptor = "(I)V",
      line = 391
   )
   private final void method3525(int arg0) {
      try {
         label35: {
            ++field6941;
            this.field6940.method4107(arg0 + -117, this);
            if (!this.field6937) {
               OpenGL.glTexParameteri(this.field6938, 10241, !this.field6932 ? 9728 : 9984);
               OpenGL.glTexParameteri(this.field6938, 10240, 9728);
               if (!client.field4360) {
                  break label35;
               }
            }

            OpenGL.glTexParameteri(this.field6938, 10241, !this.field6932 ? 9729 : 9987);
            OpenGL.glTexParameteri(this.field6938, 10240, 9729);
         }

         if (arg0 != 0) {
            this.field6938 = 108;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6949[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "<init>",
      descriptor = "(Lea;IIIZ)V",
      line = 509
   )
   public class486(class573 arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         this.field6938 = arg1;
         this.field6932 = arg4;
         this.field6944 = arg3;
         this.field6948 = arg2;
         this.field6940 = arg0;
         OpenGL.glGenTextures(1, class787.field11563, 0);
         this.field6931 = class787.field11563[0];
         this.method3523(0, -3071);
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field6949[7] + (arg0 != null ? field6949[5] : field6949[6]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "a",
      descriptor = "(ZI)V",
      line = 417
   )
   public final void method3526(boolean arg0, int arg1) {
      try {
         if (!this.field6937 == arg0) {
            this.field6937 = arg0;
            this.method3525(0);
         }

         ++field6947;
         if (arg1 != 32) {
            field6936 = null;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6949[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "finalize",
      descriptor = "()V",
      line = 434
   )
   protected final void finalize() throws Throwable {
      try {
         this.method3522((byte)-91);
         ++field6939;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6949[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "a",
      descriptor = "(JJ)J",
      line = 445
   )
   public static long method3527(long arg0, long arg1) {
      try {
         return arg0 | arg1;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field6949[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "a",
      descriptor = "(B)Z",
      line = 453
   )
   public final boolean method3528(byte arg0) {
      try {
         ++field6946;
         if (arg0 >= -10) {
            return false;
         } else if (this.field6940.field8445) {
            int var2 = this.method3530(4);
            this.field6940.method4107(26, this);
            OpenGL.glGenerateMipmapEXT(this.field6938);
            this.field6932 = true;
            this.method3525(0);
            this.method3523(var2, -3071);
            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6949[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "b",
      descriptor = "(B)I",
      line = 486
   )
   public final int method3529(byte arg0) {
      try {
         if (arg0 <= 13) {
            return 22;
         } else {
            ++field6934;
            return this.field6931;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6949[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "b",
      descriptor = "(I)I",
      line = 497
   )
   private final int method3530(int arg0) {
      try {
         ++field6945;
         int var2 = this.field6940.method4111(this.field6948, false) * this.field6944;
         if (arg0 != 4) {
            return -41;
         } else {
            return this.field6932 ? var2 * 4 / 3 : var2;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6949[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method1678(int arg0);

   @OriginalMember(
      owner = "client!sl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3531(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 102);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3532(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 14;
            break;
         case 1:
            var10005 = 112;
            break;
         case 2:
            var10005 = 25;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 102;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
