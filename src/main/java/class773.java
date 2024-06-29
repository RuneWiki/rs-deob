import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class773 extends class228 {
   @OriginalMember(
      owner = "client!jg",
      name = "q",
      descriptor = "I"
   )
   public int field11266;
   @OriginalMember(
      owner = "client!jg",
      name = "x",
      descriptor = "I"
   )
   public int field11267;
   @OriginalMember(
      owner = "client!jg",
      name = "n",
      descriptor = "I"
   )
   public int field11263;
   @OriginalMember(
      owner = "client!jg",
      name = "s",
      descriptor = "I"
   )
   public int field11264;
   @OriginalMember(
      owner = "client!jg",
      name = "r",
      descriptor = "I"
   )
   public int field11259;
   @OriginalMember(
      owner = "client!jg",
      name = "o",
      descriptor = "I"
   )
   public int field11260;
   @OriginalMember(
      owner = "client!jg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11270 = new String[]{method5584(method5583("A\u001b*\u0005&")), method5584(method5583("E\th/")), method5584(method5583("A\u001b*\u007fgE\u0015p}&")), method5584(method5583("PR*ms")), method5584(method5583("J\ne*bJ\u001eh&^Y\u0013g&}X\u0013v0")), method5584(method5583("A\u001dr\" G\u001dj$ y\tj7gF\u0019")), method5584(method5583("A\u001b*\u0006&")), method5584(method5583("A\u001b*\u0001&"))};
   @OriginalMember(
      owner = "client!jg",
      name = "u",
      descriptor = "I"
   )
   public static int field11262;
   @OriginalMember(
      owner = "client!jg",
      name = "p",
      descriptor = "I"
   )
   public static int field11265;
   @OriginalMember(
      owner = "client!jg",
      name = "w",
      descriptor = "I"
   )
   public static int field11268;
   @OriginalMember(
      owner = "client!jg",
      name = "t",
      descriptor = "Lst;"
   )
   public static class706 field11261;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!jg",
      name = "v",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field11269;

   @OriginalMember(
      owner = "client!jg",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5579(int arg0) {
      try {
         field11261 = null;
         if (arg0 != 0) {
            field11261 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field11270[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jg",
      name = "<init>",
      descriptor = "(Liba;Lbu;IIIIIIIIIIIII)V"
   )
   public class773(class237 arg0, class596 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);

      try {
         this.field11266 = arg11;
         this.field11267 = arg14;
         this.field11263 = arg13;
         this.field11264 = arg9;
         this.field11259 = arg10;
         this.field11260 = arg12;
      } catch (RuntimeException var17) {
         throw class93.method866(var17, field11270[2] + (arg0 != null ? field11270[3] : field11270[1]) + ',' + (arg1 != null ? field11270[3] : field11270[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jg",
      name = "a",
      descriptor = "(Lnl;)V"
   )
   public static final void method5580(class713 arg0) {
      class158.field2032.method452(arg0.field10467, arg0.field10466 + (arg0.method76((byte)21) >> 1), arg0.field10468, class789.field11504);
      arg0.field10465 = class789.field11504[0];
      arg0.field10464 = class789.field11504[1];
      arg0.field10460 = class789.field11504[2];
   }

   @OriginalMember(
      owner = "client!jg",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method5581(boolean arg0) {
      try {
         try {
            Method var1 = (field11269 != null ? field11269 : (field11269 = method5582(field11270[5]))).getMethod(field11270[4]);
            if (var1 != null) {
               try {
                  Runtime var2 = Runtime.getRuntime();
                  Integer var3 = (Integer)var1.invoke(var2, (Object[])null);
                  class100.field1321 = var3;
               } catch (Throwable var5) {
               }
            }

            if (arg0) {
               method5581(false);
            }
         } catch (Exception var6) {
         }

         ++field11268;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field11270[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jg",
      name = "a",
      descriptor = "(B)Ldp;"
   )
   public class499 method842(byte arg0) {
      try {
         ++field11265;
         int var2 = 70 / ((4 - arg0) / 37);
         return class793.field11596;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field11270[7] + arg0 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!jg",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method5582(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!jg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5583(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5584(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 43;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 67;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
