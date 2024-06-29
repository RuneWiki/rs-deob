import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class674 {
   @OriginalMember(
      owner = "client!lca",
      name = "a",
      descriptor = "Z"
   )
   public boolean field9896 = false;
   @OriginalMember(
      owner = "client!lca",
      name = "l",
      descriptor = "I"
   )
   public int field9898 = 64;
   @OriginalMember(
      owner = "client!lca",
      name = "d",
      descriptor = "I"
   )
   public int field9897 = 1;
   @OriginalMember(
      owner = "client!lca",
      name = "c",
      descriptor = "I"
   )
   public int field9899 = 64;
   @OriginalMember(
      owner = "client!lca",
      name = "k",
      descriptor = "I"
   )
   public int field9900 = 2;
   @OriginalMember(
      owner = "client!lca",
      name = "h",
      descriptor = "I"
   )
   public int field9901 = -1;
   @OriginalMember(
      owner = "client!lca",
      name = "i",
      descriptor = "Z"
   )
   public boolean field9906 = false;
   @OriginalMember(
      owner = "client!lca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9909 = new String[]{method4945(method4944("3\u001a\u0005_A3\u0014\u000fk")), method4945(method4944("2\u0018\u001c<gv")), method4945(method4944("4\u001a\u000bs\n2\u001a\u0013u\n\f\u000e\u0013fM3\u001e")), method4945(method4944("2\u0018\u001c<ev")), method4945(method4944("%US<Y")), method4945(method4944("0\u000e\u0011~")), method4945(method4944("2\u0018\u001c<`v")), method4945(method4944("2\u0018\u001c<fv"))};
   @OriginalMember(
      owner = "client!lca",
      name = "n",
      descriptor = "[[Z"
   )
   public static boolean[][] field9902 = new boolean[][]{{true, true, true, true, true, true, true, true, true, true, true, true, true}, {true, true, true, false, false, false, true, true, false, false, false, false, true}, {true, false, false, false, false, true, true, true, false, false, false, false, false}, {false, false, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, false, false, true, true, true, false, false, false, false, false}, {true, true, false, false, false, true, true, true, false, false, false, false, true}, {true, true, false, false, false, false, false, true, false, false, false, false, false}, {false, true, true, true, true, true, true, true, false, false, false, false, false}, {true, false, false, false, true, true, true, true, true, true, false, false, false}, {true, true, true, true, true, false, false, false, true, true, false, false, false}, {true, true, true, false, false, false, false, false, false, false, true, true, false}, new boolean[13], {true, true, true, true, true, true, true, true, true, true, true, true, true}, new boolean[13]};
   @OriginalMember(
      owner = "client!lca",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field9905 = new int[25];
   @OriginalMember(
      owner = "client!lca",
      name = "g",
      descriptor = "I"
   )
   public static int field9895;
   @OriginalMember(
      owner = "client!lca",
      name = "j",
      descriptor = "I"
   )
   public static int field9903;
   @OriginalMember(
      owner = "client!lca",
      name = "e",
      descriptor = "I"
   )
   public static int field9904;
   @OriginalMember(
      owner = "client!lca",
      name = "m",
      descriptor = "Lfia;"
   )
   public static class605 field9907;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!lca",
      name = "f",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field9908;

   @OriginalMember(
      owner = "client!lca",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method4939(int arg0) {
      try {
         ++field9903;
         if (arg0 >= -5) {
            field9907 = null;
         }

         if (!class61.field671.field3265) {
            try {
               Method var1 = (field9908 != null ? field9908 : (field9908 = method4943(field9909[2]))).getMethod(field9909[0]);
               if (var1 != null) {
                  try {
                     Runtime var2 = Runtime.getRuntime();
                     Long var3 = (Long)var1.invoke(var2, (Object[])null);
                     class155.field2005 = 1 + (int)(var3 / 1048576L);
                     return;
                  } catch (Throwable var5) {
                     return;
                  }
               }
            } catch (Exception var6) {
               return;
            }
         } else {
            class155.field2005 = 96;
         }

      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field9909[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "a",
      descriptor = "(ILwm;II)V"
   )
   private final void method4940(int arg0, class594 arg1, int arg2, int arg3) {
      try {
         ++field9904;
         if (arg2 > -37) {
            method4942(21);
         }

         if (~arg0 != -2) {
            if (~arg0 != -3) {
               if (~arg0 == -4) {
                  arg1.method4340(409855200);
                  return;
               }

               if (arg0 == 4) {
                  this.field9900 = arg1.method4288((byte)103);
                  return;
               }

               if (~arg0 == -6) {
                  this.field9897 = arg1.method4288((byte)104);
                  return;
               }

               if (arg0 == 6) {
                  this.field9906 = true;
                  return;
               }

               if (~arg0 == -8) {
                  this.field9896 = true;
                  return;
               }
            } else {
               this.field9898 = 1 + arg1.method4280(-19104);
               this.field9899 = 1 + arg1.method4280(-19104);
            }

         } else {
            this.field9901 = arg1.method4280(-19104);
            if (this.field9901 == 65535) {
               this.field9901 = -1;
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9909[6] + arg0 + ',' + (arg1 != null ? field9909[4] : field9909[5]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method4941(class594 arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         if (arg2 != -10789) {
            field9905 = null;
         }

         ++field9895;

         do {
            int var5 = arg0.method4288((byte)79);
            if (var5 == 0) {
               break;
            }

            this.method4940(var5, arg0, -76, arg1);
         } while(!var4);

      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field9909[3] + (arg0 != null ? field9909[4] : field9909[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4942(int arg0) {
      try {
         if (arg0 != -1) {
            method4939(77);
         }

         field9902 = null;
         field9907 = null;
         field9905 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9909[7] + arg0 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!lca",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method4943(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4944(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4945(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 125;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
