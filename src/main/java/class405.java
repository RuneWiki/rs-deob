import jaggl.OpenGL;
import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class405 extends class428 {
   @OriginalMember(
      owner = "client!dda",
      name = "n",
      descriptor = "Z"
   )
   private boolean field5848 = true;
   @OriginalMember(
      owner = "client!dda",
      name = "q",
      descriptor = "I"
   )
   public int field5841 = 0;
   @OriginalMember(
      owner = "client!dda",
      name = "A",
      descriptor = "Ljava/lang/String;"
   )
   public String field5838 = null;
   @OriginalMember(
      owner = "client!dda",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5864 = new String[]{method3061(method3060("6\u001ahg")), method3061(method3060("#A*%g")), method3061(method3060("<\u000be%Xp")), method3061(method3060("<\u000be%\\p")), method3061(method3060("<\u000be%^p")), method3061(method3060("<\u000be%_p")), method3061(method3060("<\u000be%[p")), method3061(method3060("<\u000be%&1\u0001m\u007f$p")), method3061(method3060("<\u000be%Yp")), method3061(method3060("<\u000be%Pp")), method3061(method3060("<\u000be%]p")), method3061(method3060("<\u000be%Sp")), method3061(method3060("<\u000be%Rp")), method3061(method3060("\u0010\ne{^-\u0002t+\u007f*\u001dky ")), method3061(method3060(";\u0000i%i-\u0001*f{6\u000ecnw=\u0001p%R7\u001bW{u,+mj}6\u0000w\u007fs;\"\\I\u007f9\u0001")), method3061(method3060("2\u000erj44\u000ejl4\u000b\u001bvbt?")), method3061(method3060("<\u000be%Qp")), method3061(method3060("<\u001ai{R=\u000et"))};
   @OriginalMember(
      owner = "client!dda",
      name = "p",
      descriptor = "Leg;"
   )
   public static class118 field5855 = new class118(72, 2);
   @OriginalMember(
      owner = "client!dda",
      name = "s",
      descriptor = "B"
   )
   public byte field5849;
   @OriginalMember(
      owner = "client!dda",
      name = "J",
      descriptor = "B"
   )
   public byte field5852;
   @OriginalMember(
      owner = "client!dda",
      name = "w",
      descriptor = "I"
   )
   public static int field5839;
   @OriginalMember(
      owner = "client!dda",
      name = "D",
      descriptor = "I"
   )
   public static int field5842;
   @OriginalMember(
      owner = "client!dda",
      name = "m",
      descriptor = "I"
   )
   public static int field5844;
   @OriginalMember(
      owner = "client!dda",
      name = "v",
      descriptor = "I"
   )
   public static int field5845;
   @OriginalMember(
      owner = "client!dda",
      name = "K",
      descriptor = "I"
   )
   public static int field5846;
   @OriginalMember(
      owner = "client!dda",
      name = "G",
      descriptor = "I"
   )
   public static int field5847;
   @OriginalMember(
      owner = "client!dda",
      name = "B",
      descriptor = "I"
   )
   public static int field5850;
   @OriginalMember(
      owner = "client!dda",
      name = "E",
      descriptor = "I"
   )
   public static int field5851;
   @OriginalMember(
      owner = "client!dda",
      name = "y",
      descriptor = "I"
   )
   public static int field5853;
   @OriginalMember(
      owner = "client!dda",
      name = "t",
      descriptor = "I"
   )
   public static int field5856;
   @OriginalMember(
      owner = "client!dda",
      name = "o",
      descriptor = "I"
   )
   public static int field5857;
   @OriginalMember(
      owner = "client!dda",
      name = "L",
      descriptor = "I"
   )
   public static int field5860;
   @OriginalMember(
      owner = "client!dda",
      name = "I",
      descriptor = "J"
   )
   public long field5843;
   @OriginalMember(
      owner = "client!dda",
      name = "F",
      descriptor = "Lkf;"
   )
   public static class266 field5859;
   @OriginalMember(
      owner = "client!dda",
      name = "C",
      descriptor = "Lew;"
   )
   public static class521 field5861;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!dda",
      name = "r",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field5863;
   @OriginalMember(
      owner = "client!dda",
      name = "H",
      descriptor = "Z"
   )
   private boolean field5862;
   @OriginalMember(
      owner = "client!dda",
      name = "z",
      descriptor = "[I"
   )
   private int[] field5840;
   @OriginalMember(
      owner = "client!dda",
      name = "x",
      descriptor = "[I"
   )
   public static int[] field5858;
   @OriginalMember(
      owner = "client!dda",
      name = "u",
      descriptor = "[Lnl;"
   )
   public class578[] field5854;

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 1
   )
   public static Class method3059(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(II)V",
      line = 3
   )
   private final void method3048(int arg0, int arg1) {
      try {
         if (arg1 == 2) {
            label19: {
               if (this.field5854 != null) {
                  class242.method1847(this.field5854, 0, this.field5854 = new class578[arg0], 0, this.field5841);
                  if (!client.field4360) {
                     break label19;
                  }
               }

               this.field5854 = new class578[arg0];
            }

            ++field5839;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5864[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(BZLjava/io/File;)V",
      line = 20
   )
   public static final void method3049(byte arg0, boolean arg1, File arg2) {
      try {
         if (arg0 != -111) {
            field5861 = null;
         }

         if (class486.field6936 == null) {
            class125.method1004(-122);
         }

         ++field5847;

         try {
            Class var3 = Class.forName(field5864[14]);
            Method var4 = var3.getDeclaredMethod(field5864[17], field5863 != null ? field5863 : (field5863 = method3059(field5864[15])), Boolean.TYPE);
            var4.invoke(class486.field6936, arg2.getAbsolutePath(), new Boolean(arg1));
         } catch (Exception var7) {
            System.out.println(field5864[13]);
            var7.printStackTrace();
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field5864[16] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5864[1] : field5864[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(B)[I",
      line = 47
   )
   public final int[] method3050(byte arg0) {
      boolean var2 = client.field4360;

      try {
         if (arg0 != 52) {
            field5857 = 11;
         }

         if (this.field5840 == null) {
            String[] var3 = new String[this.field5841];
            this.field5840 = new int[this.field5841];
            int var4 = 0;
            if (var2) {
               var3[var4] = this.field5854[var4].field8532;
               this.field5840[var4] = var4++;
            }

            while(true) {
               while(var4 < this.field5841) {
                  var3[var4] = this.field5854[var4].field8532;
                  this.field5840[var4] = var4++;
               }

               int[] var10000 = this.field5840;
               if (!var2) {
                  class741.method5370(var10000, var3, (byte)-98);
                  break;
               }

               var10000[var4] = var4++;
            }
         }

         ++field5853;
         return this.field5840;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5864[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(IIIIIII)I",
      line = 82
   )
   public static final int method3051(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         if (arg6 != 0) {
            return -43;
         } else {
            int var10 = arg4 & 3;
            ++field5846;
            if (~(arg1 & 1) == -2) {
               int var7 = arg2;
               arg2 = arg0;
               arg0 = var7;
            }

            if (~var10 == -1) {
               return arg5;
            } else if (~var10 == -2) {
               return 7 - arg3 + -arg2 + 1;
            } else {
               return var10 == 2 ? 1 - (arg0 - (-arg5 + 7)) : arg3;
            }
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field5864[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(I)V",
      line = 118
   )
   public static void method3052(int arg0) {
      try {
         field5855 = null;
         if (arg0 != 15686) {
            method3054(-86, -91, -106, (byte[])null);
         }

         field5859 = null;
         field5858 = null;
         field5861 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5864[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(BI)V",
      line = 132
   )
   public final void method3053(byte arg0, int arg1) {
      try {
         label20: {
            --this.field5841;
            ++field5842;
            if (this.field5841 == 0) {
               this.field5854 = null;
               if (!client.field4360) {
                  break label20;
               }
            }

            class242.method1847(this.field5854, arg1 + 1, this.field5854, arg1, -arg1 + this.field5841);
         }

         if (arg0 != -1) {
            this.method3048(109, 29);
         }

         this.field5840 = null;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5864[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "<init>",
      descriptor = "(Lwf;)V",
      line = 317
   )
   public class405(class147 arg0) {
      try {
         this.method3055(true, arg0);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5864[7] + (arg0 != null ? field5864[1] : field5864[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(III[B)Ljava/lang/String;",
      line = 156
   )
   public static final String method3054(int arg0, int arg1, int arg2, byte[] arg3) {
      boolean var4 = client.field4360;

      try {
         ++field5851;
         char[] var5 = new char[arg1];
         int var6 = 0;
         int var7 = 0;
         int var10000;
         byte var10001;
         if (var4) {
            var10000 = 255;
            var10001 = arg3[arg0 + var7];
         } else if (~var7 <= ~arg1) {
            var10000 = arg2;
            var10001 = 42;
            if (!var4) {
               if (arg2 < 42) {
                  return null;
               }

               return new String(var5, 0, var6);
            }
         } else {
            var10000 = 255;
            var10001 = arg3[arg0 + var7];
         }

         while(true) {
            int var8 = var10000 & var10001;
            if (~var8 != -1) {
               if (~var8 <= -129 && var8 < 160) {
                  char var9 = class361.field4923[var8 + -128];
                  if (~var9 == -1) {
                     var9 = '?';
                  }

                  var8 = var9;
               }

               var5[var6++] = (char)var8;
            }

            ++var7;
            if (~var7 <= ~arg1) {
               var10000 = arg2;
               var10001 = 42;
               if (!var4) {
                  if (arg2 < 42) {
                     return null;
                  }

                  return new String(var5, 0, var6);
               }
            } else {
               var10000 = 255;
               var10001 = arg3[arg0 + var7];
            }
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field5864[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5864[1] : field5864[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(ZLwf;)V",
      line = 199
   )
   private final void method3055(boolean arg0, class147 arg1) {
      boolean var3 = client.field4360;

      try {
         if (!arg0) {
            method3054(56, -89, 53, (byte[])null);
         }

         ++field5850;
         int var4 = arg1.method1143(-15465);
         if (~(var4 & 1) != -1) {
            this.field5862 = true;
         }

         if ((var4 & 2) != 0) {
            this.field5848 = true;
         }

         super.field6137 = arg1.method1207(false);
         this.field5843 = arg1.method1207(false);
         this.field5838 = arg1.method1204(2119550368);
         arg1.method1143(-15465);
         this.field5849 = arg1.method1162(4);
         this.field5852 = arg1.method1162(4);
         this.field5841 = arg1.method1211(-26166);
         if (this.field5841 > 0) {
            this.field5854 = new class578[this.field5841];
            int var5 = 0;
            if (var3 || this.field5841 > var5) {
               do {
                  class578 var6 = new class578();
                  if (this.field5862) {
                     arg1.method1207(!arg0);
                  }

                  if (this.field5848) {
                     var6.field8532 = arg1.method1204(2119550368);
                  }

                  var6.field8530 = arg1.method1162(4);
                  var6.field8533 = arg1.method1211(-26166);
                  this.field5854[var5] = var6;
                  ++var5;
               } while(this.field5841 > var5);

            }
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field5864[11] + arg0 + ',' + (arg1 != null ? field5864[1] : field5864[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(ILjava/lang/String;)I",
      line = 257
   )
   public final int method3056(int arg0, String arg1) {
      boolean var3 = client.field4360;

      try {
         ++field5856;
         int var4 = 0;
         if (var3) {
            if (this.field5854[var4].field8532.equalsIgnoreCase(arg1)) {
               return var4;
            }

            ++var4;
         }

         while(true) {
            while(this.field5841 > var4) {
               if (this.field5854[var4].field8532.equalsIgnoreCase(arg1)) {
                  return var4;
               }

               ++var4;
            }

            if (!var3) {
               if (arg0 != -1) {
                  method3058(121, (byte[])null, (class494)null, 83);
               }

               return -1;
            }

            if (arg0 != 0) {
               return var4;
            }

            ++var4;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5864[10] + arg0 + ',' + (arg1 != null ? field5864[1] : field5864[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(ILnl;)V",
      line = 291
   )
   public final void method3057(int arg0, class578 arg1) {
      try {
         if (arg0 != -24875) {
            method3052(-39);
         }

         if (this.field5854 == null || this.field5841 >= this.field5854.length) {
            this.method3048(this.field5841 + 5, 2);
         }

         ++field5844;
         this.field5854[this.field5841++] = arg1;
         this.field5840 = null;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5864[6] + arg0 + ',' + (arg1 != null ? field5864[1] : field5864[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(I[BLwi;I)Lpk;",
      line = 325
   )
   public static final class211 method3058(int arg0, byte[] arg1, class494 arg2, int arg3) {
      try {
         ++field5845;
         if (arg1 == null) {
            return null;
         } else {
            int var4 = OpenGL.glGenProgramARB();
            OpenGL.glBindProgramARB(arg3, var4);
            OpenGL.glProgramRawARB(arg3, 34933, arg1);
            OpenGL.glGetIntegerv(34379, class498.field7238, arg0);
            if (~class498.field7238[0] != 0) {
               OpenGL.glBindProgramARB(arg3, 0);
               return null;
            } else {
               OpenGL.glBindProgramARB(arg3, 0);
               return new class211(arg2, arg3, var4);
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5864[9] + arg0 + ',' + (arg1 != null ? field5864[1] : field5864[0]) + ',' + (arg2 != null ? field5864[1] : field5864[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3060(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3061(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 11;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
