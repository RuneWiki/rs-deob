import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public class class282 extends Canvas {
   @OriginalMember(
      owner = "client!gia",
      name = "d",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field3945;
   @OriginalMember(
      owner = "client!gia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3949 = new String[]{method2207(method2206("\u000e>!k9\u00009)1;A")), method2207(method2206("\u0012ynkx")), method2207(method2206("\u0007\",)")), method2207(method2206("\u000e>!ku\b>.1-")), method2207(method2206("\u000e>!kp\u00193!1`A")), method2207(method2206("\u000e>!kDA")), method2207(method2206("\u000e>!kGA"))};
   @OriginalMember(
      owner = "client!gia",
      name = "f",
      descriptor = "Leb;"
   )
   public static class650 field3946 = new class650(11, 8);
   @OriginalMember(
      owner = "client!gia",
      name = "e",
      descriptor = "I"
   )
   public static int field3943;
   @OriginalMember(
      owner = "client!gia",
      name = "b",
      descriptor = "I"
   )
   public static int field3944;
   @OriginalMember(
      owner = "client!gia",
      name = "a",
      descriptor = "I"
   )
   public static int field3947;
   @OriginalMember(
      owner = "client!gia",
      name = "c",
      descriptor = "I"
   )
   public static int field3948;

   @OriginalMember(
      owner = "client!gia",
      name = "paint",
      descriptor = "(Ljava/awt/Graphics;)V"
   )
   public final void paint(Graphics arg0) {
      try {
         ++field3947;
         this.field3945.paint(arg0);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3949[3] + (arg0 != null ? field3949[1] : field3949[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gia",
      name = "a",
      descriptor = "(IIII[BI[BII)V"
   )
   public static final void method2204(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, byte[] arg6, int arg7, int arg8) {
      boolean var9 = client.field4564;

      try {
         ++field3943;
         int var10 = -(arg8 >> 2);
         int var16 = -(3 & arg8);
         if (arg5 < 20) {
            method2204(-69, 47, 126, 17, (byte[])null, -72, (byte[])null, -60, -111);
         }

         int var11 = -arg1;
         if (var9 || ~var11 > -1) {
            label88:
            do {
               int var12 = var10;
               int var10001;
               if (var9) {
                  var10001 = arg2++;
                  arg6[var10001] += arg4[arg7++];
                  int var17 = arg2++;
                  arg6[var17] += arg4[arg7++];
                  int var18 = arg2++;
                  arg6[var18] += arg4[arg7++];
                  int var19 = arg2++;
                  arg6[var19] += arg4[arg7++];
                  var12 = var10 + 1;
               }

               while(true) {
                  while(~var12 > -1) {
                     var10001 = arg2++;
                     arg6[var10001] += arg4[arg7++];
                     var10001 = arg2++;
                     arg6[var10001] += arg4[arg7++];
                     var10001 = arg2++;
                     arg6[var10001] += arg4[arg7++];
                     var10001 = arg2++;
                     arg6[var10001] += arg4[arg7++];
                     ++var12;
                  }

                  int var13 = var16;
                  if (!var9) {
                     if (var9) {
                        var10001 = arg2++;
                        arg6[var10001] += arg4[arg7++];
                        var13 = var16 + 1;
                     }

                     while(true) {
                        while(var13 < 0) {
                           var10001 = arg2++;
                           arg6[var10001] += arg4[arg7++];
                           ++var13;
                        }

                        arg2 += arg0;
                        arg7 += arg3;
                        if (!var9) {
                           ++var11;
                           continue label88;
                        }

                        ++var13;
                     }
                  }

                  ++var12;
               }
            } while(~var11 > -1);

         }
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field3949[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field3949[1] : field3949[2]) + ',' + arg5 + ',' + (arg6 != null ? field3949[1] : field3949[2]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gia",
      name = "update",
      descriptor = "(Ljava/awt/Graphics;)V"
   )
   public final void update(Graphics arg0) {
      try {
         ++field3944;
         this.field3945.update(arg0);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3949[4] + (arg0 != null ? field3949[1] : field3949[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gia",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2205(int arg0) {
      try {
         if (arg0 != -7830) {
            method2205(-62);
         }

         field3946 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3949[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gia",
      name = "<init>",
      descriptor = "(Ljava/awt/Component;)V"
   )
   public class282(Component arg0) {
      try {
         this.field3945 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3949[0] + (arg0 != null ? field3949[1] : field3949[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2206(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2207(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 87;
            break;
         case 2:
            var10005 = 64;
            break;
         case 3:
            var10005 = 69;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
