import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class158 extends class370 {
   @OriginalMember(
      owner = "client!mg",
      name = "t",
      descriptor = "I"
   )
   public int field2005;
   @OriginalMember(
      owner = "client!mg",
      name = "C",
      descriptor = "I"
   )
   public int field2006;
   @OriginalMember(
      owner = "client!mg",
      name = "A",
      descriptor = "I"
   )
   public int field2012;
   @OriginalMember(
      owner = "client!mg",
      name = "x",
      descriptor = "I"
   )
   public int field2010;
   @OriginalMember(
      owner = "client!mg",
      name = "y",
      descriptor = "I"
   )
   public int field2013;
   @OriginalMember(
      owner = "client!mg",
      name = "v",
      descriptor = "I"
   )
   public int field2011;
   @OriginalMember(
      owner = "client!mg",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2015 = new String[]{method1315(method1314("ZhS\"\u001b")), method1315(method1314("Yz\u0011\u0005")), method1315(method1314("ZhSUZYf\tW\u001b")), method1315(method1314("L!SGN")), method1315(method1314("ZhS%\u001b")), method1315(method1314("ZhS(\u001b")), method1315(method1314("Zn\u0005$VZ`\u000f\u0010")), method1315(method1314("]n\u000b\b\u001d[n\u0013\u000e\u001dez\u0013\u001dZZj")), method1315(method1314("ZhS#\u001b"))};
   @OriginalMember(
      owner = "client!mg",
      name = "D",
      descriptor = "Lii;"
   )
   public static class579 field2002 = new class579(2);
   @OriginalMember(
      owner = "client!mg",
      name = "w",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field2009 = new String[8];
   @OriginalMember(
      owner = "client!mg",
      name = "u",
      descriptor = "I"
   )
   public static int field2003;
   @OriginalMember(
      owner = "client!mg",
      name = "s",
      descriptor = "I"
   )
   public static int field2004;
   @OriginalMember(
      owner = "client!mg",
      name = "B",
      descriptor = "I"
   )
   public static int field2007;
   @OriginalMember(
      owner = "client!mg",
      name = "z",
      descriptor = "Lclient;"
   )
   public static client field2008;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!mg",
      name = "r",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field2014;

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!mg",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 1
   )
   public static Class method1313(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!mg",
      name = "d",
      descriptor = "(I)V",
      line = 10
   )
   public static final void method1309(int arg0) {
      try {
         ++field2004;
         if (arg0 > 65) {
            if (!class755.field11144.field10706) {
               try {
                  Method var1 = (field2014 != null ? field2014 : (field2014 = method1313(field2015[7]))).getMethod(field2015[6]);
                  if (var1 != null) {
                     try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long)var1.invoke(var2, (Object[])null);
                        class56.field704 = (int)(var3 / 1048576L) + 1;
                        return;
                     } catch (Throwable var5) {
                        return;
                     }
                  }
               } catch (Exception var6) {
                  return;
               }
            } else {
               class56.field704 = 96;
            }

         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field2015[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mg",
      name = "a",
      descriptor = "(IIBZLeaa;I)V",
      line = 43
   )
   public static final void method1310(int arg0, int arg1, byte arg2, boolean arg3, class526 arg4, int arg5) {
      try {
         ++field2007;
         if (arg2 != -120) {
            method1309(52);
         }

         class658.method4733(arg1, arg5, 0L, arg0, (byte)61, arg3, arg4);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field2015[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field2015[3] : field2015[1]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mg",
      name = "<init>",
      descriptor = "(Lwm;Lvh;IIIIIIIIIIIII)V",
      line = 54
   )
   public class158(class590 arg0, class378 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);

      try {
         this.field2005 = arg12;
         this.field2006 = arg11;
         this.field2012 = arg13;
         this.field2010 = arg9;
         this.field2013 = arg14;
         this.field2011 = arg10;
      } catch (RuntimeException var17) {
         throw class670.method4877(var17, field2015[2] + (arg0 != null ? field2015[3] : field2015[1]) + ',' + (arg1 != null ? field2015[3] : field2015[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mg",
      name = "a",
      descriptor = "(I)Loi;",
      line = 69
   )
   public class79 method1311(int arg0) {
      try {
         if (arg0 > -106) {
            method1312(14);
         }

         ++field2003;
         return class675.field10143;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2015[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mg",
      name = "e",
      descriptor = "(I)V",
      line = 80
   )
   public static void method1312(int arg0) {
      try {
         field2002 = null;
         if (arg0 != 0) {
            field2008 = null;
         }

         field2009 = null;
         field2008 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2015[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1314(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1315(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 125;
            break;
         case 3:
            var10005 = 105;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
