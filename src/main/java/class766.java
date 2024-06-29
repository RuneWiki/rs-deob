import java.io.File;
import java.lang.reflect.Method;
import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public class class766 extends class163 {
   @OriginalMember(
      owner = "client!sia",
      name = "p",
      descriptor = "[Lrd;"
   )
   public class354[] field11243;
   @OriginalMember(
      owner = "client!sia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11250 = new String[]{method5552(method5551("}\u0004[{\u001f&")), method5552(method5551("F\b[%\u0011{\u0000Ju0|\u001fU'o")), method5552(method5551("}\u0004[{\u001d&")), method5552(method5551("uC\u0014{(")), method5552(method5551("d\fL4{b\fT2{]\u0019H<;i")), method5552(method5551("m\u0002W{&{\u0003\u001484`\f]08k\u0003N{\u001da\u0019i%:z)S42`\u0002I!<m b\u00170o\u0003")), method5552(method5551("j\u0018W%\u001dk\fJ")), method5552(method5551("`\u0018V9")), method5552(method5551("}\u0004[{\u001c&")), method5552(method5551("}\u0004[{\u0012&")), method5552(method5551("}\u0004[{\u001e&")), method5552(method5551("}\u0004[{\u0013&")), method5552(method5551("}\u0004[{\u0019&")), method5552(method5551("}\u0004[{ig\u0003S!k&")), method5552(method5551("}\u0004[{\u0010&"))};
   @OriginalMember(
      owner = "client!sia",
      name = "j",
      descriptor = "Lsda;"
   )
   public static class269 field11247;
   @OriginalMember(
      owner = "client!sia",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field11248;
   @OriginalMember(
      owner = "client!sia",
      name = "n",
      descriptor = "I"
   )
   public static int field11238;
   @OriginalMember(
      owner = "client!sia",
      name = "r",
      descriptor = "I"
   )
   public static int field11239;
   @OriginalMember(
      owner = "client!sia",
      name = "i",
      descriptor = "I"
   )
   public static int field11240;
   @OriginalMember(
      owner = "client!sia",
      name = "m",
      descriptor = "I"
   )
   public static int field11242;
   @OriginalMember(
      owner = "client!sia",
      name = "q",
      descriptor = "I"
   )
   public static int field11244;
   @OriginalMember(
      owner = "client!sia",
      name = "g",
      descriptor = "I"
   )
   public static int field11245;
   @OriginalMember(
      owner = "client!sia",
      name = "k",
      descriptor = "I"
   )
   public static int field11246;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!sia",
      name = "l",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field11249;
   @OriginalMember(
      owner = "client!sia",
      name = "o",
      descriptor = "[Lat;"
   )
   public static class396[] field11241;

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!sia",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 1
   )
   public static Class method5550(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   static {
      new BitSet(65536);
      field11247 = new class269(52, 0);
      field11248 = new int[50];
   }

   @OriginalMember(
      owner = "client!sia",
      name = "a",
      descriptor = "(IZ)V",
      line = 3
   )
   public static final void method5542(int arg0, boolean arg1) {
      try {
         ++field11240;
         class403 var2 = class453.method3410((long)arg0, true, 3);
         if (arg1) {
            field11248 = null;
         }

         var2.method3096((byte)-98);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field11250[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sia",
      name = "a",
      descriptor = "(BI)Z",
      line = 17
   )
   public static final boolean method5543(byte arg0, int arg1) {
      try {
         ++field11242;
         if (arg0 >= -34) {
            method5542(-9, false);
         }

         return arg1 == 3 || arg1 == 4 || arg1 == 5 || arg1 == 6;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11250[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sia",
      name = "a",
      descriptor = "(ZLjava/io/File;B)V",
      line = 28
   )
   public static final void method5544(boolean arg0, File arg1, byte arg2) {
      try {
         ++field11239;
         if (class752.field11125 == null) {
            class761.method5514(1);
         }

         try {
            if (arg2 != -123) {
               method5547(40, -25);
            }

            Class var3 = Class.forName(field11250[5]);
            Method var4 = var3.getDeclaredMethod(field11250[6], field11249 != null ? field11249 : (field11249 = method5550(field11250[4])), Boolean.TYPE);
            var4.invoke(class752.field11125, arg1.getAbsolutePath(), new Boolean(arg0));
         } catch (Exception var7) {
            System.out.println(field11250[1]);
            var7.printStackTrace();
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field11250[2] + arg0 + ',' + (arg1 != null ? field11250[3] : field11250[7]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sia",
      name = "a",
      descriptor = "(IBII)V",
      line = 52
   )
   public static final void method5545(int arg0, byte arg1, int arg2, int arg3) {
      int var4 = client.field4530;

      try {
         label53: {
            ++field11246;
            if (arg0 == 1006) {
               class265.method2025(class249.field3339, arg3, arg2);
               if (var4 == 0) {
                  break label53;
               }
            }

            if (arg0 == 1012) {
               class265.method2025(class665.field9664, arg3, arg2);
               if (var4 == 0) {
                  break label53;
               }
            }

            if (arg0 == 1008) {
               class265.method2025(class408.field6227, arg3, arg2);
               if (var4 == 0) {
                  break label53;
               }
            }

            if (arg0 == 1002) {
               class265.method2025(class637.field9258, arg3, arg2);
               if (var4 == 0) {
                  break label53;
               }
            }

            if (~arg0 == -1005) {
               class265.method2025(class622.field9060, arg3, arg2);
            }
         }

         if (arg1 < 43) {
            field11248 = null;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field11250[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sia",
      name = "b",
      descriptor = "(B)V",
      line = 81
   )
   public static final void method5546(byte arg0) {
      try {
         if (arg0 != 8) {
            method5545(81, (byte)99, 81, 104);
         }

         class327.field4635 = class170.method1367(2048, true, arg0 + -136, 8, 0.4F, 8, 35, 4);
         ++field11238;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11250[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sia",
      name = "a",
      descriptor = "(II)Z",
      line = 96
   )
   public static final boolean method5547(int arg0, int arg1) {
      try {
         ++field11244;
         if (arg0 != 1008) {
            field11241 = null;
         }

         return ~(arg1 & -arg1) == ~arg1;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11250[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sia",
      name = "a",
      descriptor = "(B)V",
      line = 111
   )
   public static void method5548(byte arg0) {
      try {
         if (arg0 != 120) {
            field11241 = null;
         }

         field11248 = null;
         field11247 = null;
         field11241 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11250[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sia",
      name = "<init>",
      descriptor = "([Lrd;)V",
      line = 124
   )
   public class766(class354[] arg0) {
      try {
         this.field11243 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11250[13] + (arg0 != null ? field11250[3] : field11250[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sia",
      name = "c",
      descriptor = "(I)V",
      line = 137
   )
   public static final void method5549(int arg0) {
      try {
         class448.field6805 = 1;
         ++field11245;
         class149.field1859 = -1;
         if (arg0 == -1005) {
            class18.method127(class591.field8737.equals(""), class591.field8737, true, 0, "");
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11250[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5551(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5552(char[] arg0) {
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
            var10005 = 109;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
