import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class263 {
   @OriginalMember(
      owner = "client!gca",
      name = "c",
      descriptor = "Lbo;"
   )
   public class762 field3628 = new class762();
   @OriginalMember(
      owner = "client!gca",
      name = "h",
      descriptor = "Z"
   )
   public boolean field3632 = false;
   @OriginalMember(
      owner = "client!gca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3633 = new String[]{method2013(method2012("2W\t\u000b")), method2013(method2012("'\fKI\u0006")), method2013(method2012(";A\u0004I=t")), method2013(method2012(";A\u0004I8t")), method2013(method2012(";A\u0004I9t")), method2013(method2012(";A\u0004I?t")), method2013(method2012(";A\u0004I>t")), method2013(method2012(";A\u0004I:t")), method2013(method2012(";A\u0004IG5L\f\u0013Et"))};
   @OriginalMember(
      owner = "client!gca",
      name = "b",
      descriptor = "[S"
   )
   public static short[] field3625 = new short[256];
   @OriginalMember(
      owner = "client!gca",
      name = "e",
      descriptor = "Lek;"
   )
   public static class536 field3631 = new class536(76, -1);
   @OriginalMember(
      owner = "client!gca",
      name = "i",
      descriptor = "I"
   )
   public static int field3624;
   @OriginalMember(
      owner = "client!gca",
      name = "g",
      descriptor = "I"
   )
   public static int field3626;
   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "I"
   )
   public static int field3627;
   @OriginalMember(
      owner = "client!gca",
      name = "d",
      descriptor = "I"
   )
   public static int field3629;
   @OriginalMember(
      owner = "client!gca",
      name = "f",
      descriptor = "I"
   )
   public static int field3630;

   @OriginalMember(
      owner = "client!gca",
      name = "b",
      descriptor = "(B)V",
      line = 3
   )
   public static void method2006(byte arg0) {
      try {
         field3625 = null;
         field3631 = null;
         if (arg0 != -25) {
            field3625 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3633[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(Lwf;I)Luk;",
      line = 16
   )
   public static final class273 method2007(class147 arg0, int arg1) {
      try {
         ++field3626;
         class270 var2 = class663.method4841(arg1 ^ 18562, arg0);
         int var3 = arg0.method1164(19693);
         if (arg1 != 18563) {
            field3625 = null;
         }

         int var4 = arg0.method1164(19693);
         return new class273(var2.field3728, var2.field3724, var2.field3725, var2.field3727, var2.field3731, var2.field3729, var2.field3738, var2.field3736, var2.field3732, var3, var4);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field3633[3] + (arg0 != null ? field3633[1] : field3633[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(Z)V",
      line = 40
   )
   public final void method2008(boolean arg0) {
      boolean var2 = client.field4360;

      try {
         ++field3630;

         while(true) {
            class623 var3 = (class623)this.field3628.method5526(true);
            if (var3 != null) {
               var3.method12((byte)108);
               class198.method1565(false, var3);
               if (var2) {
                  break;
               }

               if (!var2) {
                  continue;
               }
            }

            if (!arg0) {
               this.method2009(-112, (class623)null);
               return;
            }
            break;
         }

      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field3633[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(ILth;)V",
      line = 61
   )
   public final void method2009(int param1, class623 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gca",
      name = "c",
      descriptor = "(B)V",
      line = 130
   )
   public static final void method2010(byte arg0) {
      try {
         ++field3624;
         class235.field3273 = 1;
         class686.field10122 = -1;
         if (arg0 < 88) {
            field3625 = null;
         }

         class136.field1737 = class430.field6143;
         String var1 = null;
         if (class314.field4289 != null) {
            class147 var2 = new class147(class314.field4289);
            var1 = class727.method5302(var2.method1207(false), -27867);
            class484.field6927 = var2.method1207(false);
         }

         if (var1 == null) {
            class244.method1858(35, 0);
         } else {
            class506.method3675(false, true, "", var1, 0);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3633[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "<init>",
      descriptor = "(Z)V",
      line = 204
   )
   public class263(boolean arg0) {
      try {
         this.field3632 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3633[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(B)V",
      line = 171
   )
   public static final void method2011(byte arg0) {
      boolean var1 = client.field4360;

      try {
         ++field3627;
         int var2 = 0;
         if (!var1 && ~class673.field9755 >= ~var2) {
            if (arg0 < 19) {
               method2010((byte)-48);
            }
         } else {
            do {
               class245 var3 = class534.field7614[var2];
               if (var3.field3388 == 3) {
                  if (var3.field3375 == null) {
                     var3.field3382 = Integer.MIN_VALUE;
                     if (var1) {
                        class280.field3897.method4815(var3.field3375);
                        ++var2;
                     } else {
                        ++var2;
                     }
                  } else {
                     class280.field3897.method4815(var3.field3375);
                     ++var2;
                  }
               } else {
                  ++var2;
               }
            } while(~class673.field9755 < ~var2);

            if (arg0 < 19) {
               method2010((byte)-48);
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field3633[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2012(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2013(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 92;
            break;
         case 1:
            var10005 = 34;
            break;
         case 2:
            var10005 = 101;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
