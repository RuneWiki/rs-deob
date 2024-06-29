import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gja")
public class class53 {
   @OriginalMember(
      owner = "client!gja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field585 = new String[]{method426(method425("{\fUe")), method426(method425("nW\u0017'|")), method426(method425("r\u0013X'E=")), method426(method425("r\u0013X'D=")), method426(method425("v\u0016T'r`\u0017\u0017d`{\u0018^llp\u0017M'Iz\rjyna=Phf{\u0016J}hv4aKdt\u0017")), method426(method425("\u007f\u0018Oh/y\u0018Wn/V\u0015Xzr")), method426(method425("{\u001cNYmt\r_fsx4aKdt\u0017i{nm\u0000")), method426(method425("]\u001cXyE`\u0014I)rp\rLy!p\u000bKfs/")), method426(method425("r\u0013X'@=")), method426(method425("\u007f\u0018Ohy;\u0014Xg`r\u001cTloaWtKdt\u0017jlsc\u001cKJn{\u0017\\ju|\u0016W")), method426(method425("\u007f\u0018Oh/y\u0018Wn/F\rK`or")), method426(method425("v\u0016T'r`\u0017\u0017d`{\u0018^llp\u0017M3ul\t\\4Iz\rjyna=Phf{\u0016J}hv")), method426(method425("\u007f\u0018Oh/y\u0018Wn/x\u0018Whfp\u0014\\gu;4Xg`r\u001cTloa?Xjuz\u000b@")), method426(method425("r\u001cMYmt\r_fsx4{l`{*\\{wp\u000b")), method426(method425("r\u0013X'B=")), method426(method425("r\u0013X'C="))};
   @OriginalMember(
      owner = "client!gja",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field579 = new int[2];
   @OriginalMember(
      owner = "client!gja",
      name = "h",
      descriptor = "I"
   )
   public static int field577;
   @OriginalMember(
      owner = "client!gja",
      name = "b",
      descriptor = "I"
   )
   public static int field578;
   @OriginalMember(
      owner = "client!gja",
      name = "a",
      descriptor = "I"
   )
   public static int field580;
   @OriginalMember(
      owner = "client!gja",
      name = "e",
      descriptor = "I"
   )
   public static int field581;
   @OriginalMember(
      owner = "client!gja",
      name = "g",
      descriptor = "I"
   )
   public static int field582;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!gja",
      name = "d",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field583;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!gja",
      name = "f",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field584;

   @OriginalMember(
      owner = "client!gja",
      name = "a",
      descriptor = "(IZII)I"
   )
   public static final int method419(int arg0, boolean arg1, int arg2, int arg3) {
      try {
         ++field580;
         class784 var4 = class655.method4729(arg1, arg0, (byte)-110);
         if (arg2 > -107) {
            return -75;
         } else if (var4 == null) {
            return -1;
         } else {
            return ~arg3 <= -1 && ~var4.field11463.length < ~arg3 ? var4.field11463[arg3] : -1;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field585[14] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gja",
      name = "a",
      descriptor = "(ZB)V"
   )
   public static final void method420(boolean arg0, byte arg1) {
      boolean var2 = client.field4273;

      try {
         if (arg1 > 68) {
            ++field578;
            ++class381.field5338;
            class471 var3 = class133.method1118(class605.field8474.field2787, 2, class619.field8651);
            class605.field8474.method1702((byte)-106, var3);
            class588 var4 = (class588)class202.field2476.method1850(0);
            if (var2) {
               if (!var4.method3610(536870911)) {
                  var4 = (class588)class202.field2476.method1850(0);
                  if (var4 == null && !var2 && !var2) {
                     if (class392.field5480 != null) {
                        class383.method2943(false, class392.field5480);
                        class392.field5480 = null;
                        return;
                     }

                     return;
                  }
               }

               if (~var4.field8106 == -1) {
                  class181.method1386(arg0, true, true, var4);
               }

               var4 = (class588)class202.field2476.method1847(127);
            }

            while(true) {
               while(var4 != null) {
                  if (!var4.method3610(536870911)) {
                     var4 = (class588)class202.field2476.method1850(0);
                     if (var4 == null && !var2 && !var2) {
                        if (class392.field5480 != null) {
                           class383.method2943(false, class392.field5480);
                           class392.field5480 = null;
                           return;
                        }

                        return;
                     }
                  }

                  if (~var4.field8106 == -1) {
                     class181.method1386(arg0, true, true, var4);
                  }

                  var4 = (class588)class202.field2476.method1847(127);
               }

               if (!var2) {
                  if (class392.field5480 != null) {
                     class383.method2943(false, class392.field5480);
                     class392.field5480 = null;
                     return;
                  }

                  return;
               }

               if (~var4.field8106 == -1) {
                  class181.method1386(arg0, true, true, var4);
               }

               var4 = (class588)class202.field2476.method1847(127);
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field585[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gja",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method421(int arg0) {
      try {
         field579 = null;
         int var1 = 71 / ((arg0 - -61) / 43);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field585[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gja",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final synchronized void method422(boolean arg0) {
      try {
         ++field577;
         if (class362.field5132 == null) {
            try {
               Class var1 = Class.forName(field585[12]);
               Method var2 = var1.getDeclaredMethod(field585[13], (Class[])null);
               Object var3 = var2.invoke((Object)null, (Object[])null);
               Method var4 = var1.getMethod(field585[6], Class.forName(field585[9]), field583 != null ? field583 : (field583 = method424(field585[10])), field584 != null ? field584 : (field584 = method424(field585[5])));
               class362.field5132 = var4.invoke((Object)null, var3, field585[11], Class.forName(field585[4]));
            } catch (Exception var7) {
               System.out.println(field585[7]);
               var7.printStackTrace();
            }

            if (arg0) {
               method423(92, (class160)null, -51, (Canvas)null, -9);
            }
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field585[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gja",
      name = "a",
      descriptor = "(ILd;ILjava/awt/Canvas;I)Lha;"
   )
   public static final class65 method423(int arg0, class160 arg1, int arg2, Canvas arg3, int arg4) {
      try {
         ++field582;
         if (arg2 != -1) {
            method423(-80, (class160)null, -42, (Canvas)null, -59);
         }

         return new class587(arg3, arg1, arg0, arg4);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field585[2] + arg0 + ',' + (arg1 != null ? field585[1] : field585[0]) + ',' + arg2 + ',' + (arg3 != null ? field585[1] : field585[0]) + ',' + arg4 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!gja",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method424(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!gja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method425(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method426(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 121;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
