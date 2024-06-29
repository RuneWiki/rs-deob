import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class124 extends class174 {
   @OriginalMember(
      owner = "client!bba",
      name = "F",
      descriptor = "I"
   )
   private int field1551;
   @OriginalMember(
      owner = "client!bba",
      name = "o",
      descriptor = "I"
   )
   private int field1547;
   @OriginalMember(
      owner = "client!bba",
      name = "u",
      descriptor = "I"
   )
   private int field1548;
   @OriginalMember(
      owner = "client!bba",
      name = "q",
      descriptor = "I"
   )
   private int field1553;
   @OriginalMember(
      owner = "client!bba",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1557 = new String[]{method1045(method1044("?c$,-u")), method1045(method1044("?c$,S4o,vQu")), method1045(method1044("?c$,,u")), method1045(method1044("3t)n")), method1045(method1044("&/k,\u0012")), method1045(method1044("?c$,*u")), method1045(method1044("?c$,+u")), method1045(method1044("?c$,(u")), method1045(method1044("?c$,.u")), method1045(method1044("?c$,)u"))};
   @OriginalMember(
      owner = "client!bba",
      name = "w",
      descriptor = "Z"
   )
   public static boolean field1549 = true;
   @OriginalMember(
      owner = "client!bba",
      name = "A",
      descriptor = "I"
   )
   public static int field1540;
   @OriginalMember(
      owner = "client!bba",
      name = "C",
      descriptor = "I"
   )
   private int field1541;
   @OriginalMember(
      owner = "client!bba",
      name = "z",
      descriptor = "I"
   )
   public static int field1542;
   @OriginalMember(
      owner = "client!bba",
      name = "p",
      descriptor = "I"
   )
   public static int field1543;
   @OriginalMember(
      owner = "client!bba",
      name = "v",
      descriptor = "I"
   )
   private int field1545;
   @OriginalMember(
      owner = "client!bba",
      name = "x",
      descriptor = "I"
   )
   public static int field1546;
   @OriginalMember(
      owner = "client!bba",
      name = "r",
      descriptor = "I"
   )
   public static int field1550;
   @OriginalMember(
      owner = "client!bba",
      name = "E",
      descriptor = "I"
   )
   private int field1552;
   @OriginalMember(
      owner = "client!bba",
      name = "y",
      descriptor = "I"
   )
   public static int field1554;
   @OriginalMember(
      owner = "client!bba",
      name = "t",
      descriptor = "I"
   )
   public static int field1555;
   @OriginalMember(
      owner = "client!bba",
      name = "D",
      descriptor = "I"
   )
   private int field1556;
   @OriginalMember(
      owner = "client!bba",
      name = "B",
      descriptor = "Lvea;"
   )
   public static class289 field1539;
   @OriginalMember(
      owner = "client!bba",
      name = "s",
      descriptor = "[B"
   )
   private byte[] field1544;

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "([[BBLrq;)V"
   )
   public static final void method1037(byte[][] param0, byte param1, class372 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(BII)V"
   )
   public final void method1038(byte arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         label50: {
            ++field1542;
            if (~arg2 != -1) {
               label41: {
                  this.field1541 = this.field1551 * this.field1545 >> 12;
                  this.field1545 = -(arg1 < 0 ? -arg1 : arg1) + this.field1547;
                  if (~this.field1541 <= -1) {
                     if (this.field1541 <= 4096) {
                        break label41;
                     }

                     this.field1541 = 4096;
                     if (!var4) {
                        break label41;
                     }
                  }

                  this.field1541 = 0;
               }

               this.field1545 = this.field1545 * this.field1545 >> 12;
               this.field1545 = this.field1545 * this.field1541 >> 12;
               this.field1556 += this.field1553 * this.field1545 >> 12;
               this.field1553 = this.field1553 * this.field1548 >> 12;
               if (!var4) {
                  break label50;
               }
            }

            this.field1545 = this.field1547 + -(arg1 < 0 ? -arg1 : arg1);
            this.field1545 = this.field1545 * this.field1545 >> 12;
            this.field1541 = 4096;
            this.field1556 = this.field1545;
         }

         if (arg0 != -81) {
            this.field1551 = -81;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field1557[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(IIB)V"
   )
   public void method1039(int arg0, int arg1, byte arg2) {
      try {
         ++field1543;
         int var4 = 126 % ((arg1 - 39) / 62);
         this.field1544[arg0] = arg2;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field1557[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method1040(int arg0) {
      try {
         label23: {
            this.field1556 >>= 4;
            this.field1553 = this.field1548;
            ++field1554;
            if (this.field1556 < 0) {
               this.field1556 = 0;
               if (!client.field4273) {
                  break label23;
               }
            }

            if (this.field1556 > 255) {
               this.field1556 = 255;
            }
         }

         this.method1039(this.field1552++, 112, (byte)this.field1556);
         if (arg0 >= 45) {
            this.field1556 = 0;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1557[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(IILor;Ljava/lang/String;)Lgg;"
   )
   public static final class186 method1041(int arg0, int arg1, class670 arg2, String arg3) {
      try {
         ++field1550;
         int var4 = OpenGL.glGenProgramARB();
         OpenGL.glBindProgramARB(arg0, var4);
         OpenGL.glProgramStringARB(arg0, 34933, arg3);
         OpenGL.glGetIntegerv(34379, class380.field5325, 0);
         if (class380.field5325[0] != -1) {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
         } else {
            if (arg1 > -38) {
               method1042(false);
            }

            OpenGL.glBindProgramARB(arg0, 0);
            return new class186(arg2, arg0, var4);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field1557[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1557[4] : field1557[3]) + ',' + (arg3 != null ? field1557[4] : field1557[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method1042(boolean arg0) {
      try {
         field1539 = null;
         if (!arg0) {
            field1549 = false;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1557[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "<init>",
      descriptor = "(IIIIIFFF)V"
   )
   public class124(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
      super(arg0, arg1, arg2, arg3, arg4);

      try {
         this.field1551 = (int)(arg7 * 4096.0F);
         this.field1547 = (int)(arg6 * 4096.0F);
         this.field1553 = this.field1548 = (int)(Math.pow(0.5D, (double)(-arg5)) * 4096.0D);
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field1557[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method1043(boolean arg0) {
      try {
         if (!arg0) {
            this.field1556 = 0;
            ++field1555;
            this.field1552 = 0;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1557[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1044(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 111);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1045(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 2;
            break;
         default:
            var10005 = 111;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
