import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class50 {
   @OriginalMember(
      owner = "client!gca",
      name = "d",
      descriptor = "I"
   )
   private int field751;
   @OriginalMember(
      owner = "client!gca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field759 = new String[]{method549(method548("{@C\u0002\u00104")), method549(method548("{@C\u0002\u00154")), method549(method548("{@C\u0002\u00164")), method549(method548("{@C\u0002ouMKXm4")), method549(method548("rVN@")), method549(method548("g\r\f\u0002.")), method549(method548("{@C\u0002\u00174")), method549(method548("{@C\u0002\u00114")), method549(method548("{@C\u0002\u00124"))};
   @OriginalMember(
      owner = "client!gca",
      name = "e",
      descriptor = "I"
   )
   public static int field752 = 0;
   @OriginalMember(
      owner = "client!gca",
      name = "h",
      descriptor = "I"
   )
   public static int field753;
   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "I"
   )
   public static int field754;
   @OriginalMember(
      owner = "client!gca",
      name = "g",
      descriptor = "I"
   )
   public static int field755;
   @OriginalMember(
      owner = "client!gca",
      name = "c",
      descriptor = "I"
   )
   public static int field756;
   @OriginalMember(
      owner = "client!gca",
      name = "f",
      descriptor = "I"
   )
   public static int field757;
   @OriginalMember(
      owner = "client!gca",
      name = "b",
      descriptor = "I"
   )
   public static int field758;

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method542(int arg0) {
      boolean var1 = client.field10022;

      try {
         ++field753;
         class408 var2 = class745.field10605.field3719;

         while(true) {
            if (~var2.method3197(8, class745.field10605.field3721) <= -16) {
               int var3 = var2.method3195(127, 15);
               if (~var3 != -32768) {
                  boolean var4 = false;
                  class432 var5 = (class432)class573.field8110.method3101(-1, (long)var3);
                  if (var5 == null) {
                     class799 var6 = new class799();
                     var6.field5826 = var3;
                     var5 = new class432(var6);
                     class573.field8110.method3098((long)var3, var5, -1);
                     var4 = true;
                     class270.field4135[class157.field2391++] = var5;
                  }

                  class799 var7 = var5.field6345;
                  class344.field5068[class261.field3995++] = var3;
                  var7.field5841 = class365.field5400;
                  if (var7.field11618 != null && var7.field11618.method2497(-16017)) {
                     class290.method2402(var7, -40);
                  }

                  int var8 = var2.method3195(126, 5);
                  if (~var8 < -16) {
                     var8 -= 32;
                  }

                  int var9 = var2.method3195(111, 5);
                  if (var9 > 15) {
                     var9 -= 32;
                  }

                  int var10 = var2.method3195(112, 2);
                  var7.method5757(class478.field6879.method4873(var2.method3195(116, 14), true), (byte)-90);
                  int var11 = var2.method3195(123, 1);
                  if (~var11 == -2) {
                     class463.field6742[class190.field2788++] = var3;
                  }

                  int var12 = 14937 & var2.method3195(124, 3) - -4 << 11;
                  int var13 = var2.method3195(115, 1);
                  var7.method3067(var7.field11618.field4529, 1);
                  var7.field5839 = var7.field11618.field4499 << 3;
                  if (var4) {
                     var7.method3075(true, var12, -1);
                  }

                  var7.method5760(class117.field1849.field5865[0] + var9, var10, -110, var13 == 1, class117.field1849.field5861[0] - -var8, var7.method1507(-105));
                  if (!var7.field11618.method2497(-16017)) {
                     continue;
                  }

                  class449.method3479(115, var7.field5865[0], var7, 0, var7.field6824, (class158)null, (class544)null, var7.field5861[0]);
                  if (var1) {
                     break;
                  }

                  if (!var1) {
                     continue;
                  }
               }
            }

            var2.method3192((byte)59);
            break;
         }

         if (arg0 >= -79) {
            method543((class17)null, 2, 12);
         }
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field759[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(Lha;II)Lwm;"
   )
   public static final class440 method543(class17 arg0, int arg1, int arg2) {
      try {
         ++field756;
         class24 var3 = class368.method2897(arg2, arg0, true, -570166910);
         if (var3 == null) {
            return null;
         } else {
            if (arg1 != 0) {
               field752 = -115;
            }

            return var3.field350;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field759[6] + (arg0 != null ? field759[5] : field759[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method544(int arg0, int arg1) {
      try {
         OpenGL.glNewList(this.field751 + arg0, 4864);
         int var3 = 42 / ((arg1 - -38) / 37);
         ++field755;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field759[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method545(byte arg0) {
      try {
         OpenGL.glEndList();
         if (arg0 != 93) {
            method542(-61);
         }

         ++field754;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field759[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method546(int arg0, int arg1) {
      boolean var2 = client.field10022;

      try {
         ++field758;
         if (class132.method1345(77, arg1)) {
            class91[] var3 = class315.field4719[arg1];
            int var4 = arg0;
            if (var2 || ~var3.length < ~arg0) {
               do {
                  class91 var5 = var3[var4];
                  if (var5 != null && var5.field1337 != null) {
                     var5.field1337.method2192(77);
                  }

                  ++var4;
               } while(~var3.length < ~var4);

            }
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field759[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(CZ)V"
   )
   public final void method547(char arg0, boolean arg1) {
      try {
         ++field757;
         if (!arg1) {
            method542(16);
         }

         OpenGL.glCallList(this.field751 + arg0);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field759[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "<init>",
      descriptor = "(Laea;I)V"
   )
   public class50(class678 arg0, int arg1) {
      try {
         this.field751 = OpenGL.glGenLists(arg1);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field759[3] + (arg0 != null ? field759[5] : field759[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method548(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method549(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 44;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
