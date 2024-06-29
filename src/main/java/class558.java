import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class558 extends class14 {
   @OriginalMember(
      owner = "client!iba",
      name = "y",
      descriptor = "Lds;"
   )
   private class16 field7999;
   @OriginalMember(
      owner = "client!iba",
      name = "t",
      descriptor = "Llca;"
   )
   private class673 field8004;
   @OriginalMember(
      owner = "client!iba",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8008 = new String[]{method4006(method4005("\u0001\u0002\u0005 ^")), method4006(method4005("\u0013NJ iR")), method4006(method4005("\u0014YGb")), method4006(method4005("\u0013NJ bR")), method4006(method4005("\u0013NJ `R")), method4006(method4005("\u0013NJ aR")), method4006(method4005("Z\u007f\u0011.")), method4006(method4005("\u0013NJ jR")), method4006(method4005("\u0013NJ \u001f\u0013BBz\u001dR")), method4006(method4005("\u0013NJ dR")), method4006(method4005("\u0013NJ hR")), method4006(method4005("\u0013NJ fR")), method4006(method4005("\u0013NJ kR")), method4006(method4005("\u0013NJ oR"))};
   @OriginalMember(
      owner = "client!iba",
      name = "x",
      descriptor = "Lqd;"
   )
   public static class475 field8001 = new class475("", 16);
   @OriginalMember(
      owner = "client!iba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field8005 = new String[100];
   @OriginalMember(
      owner = "client!iba",
      name = "w",
      descriptor = "I"
   )
   public static int field7994;
   @OriginalMember(
      owner = "client!iba",
      name = "u",
      descriptor = "I"
   )
   public static int field7995;
   @OriginalMember(
      owner = "client!iba",
      name = "o",
      descriptor = "I"
   )
   public static int field7996;
   @OriginalMember(
      owner = "client!iba",
      name = "p",
      descriptor = "I"
   )
   public static int field7997;
   @OriginalMember(
      owner = "client!iba",
      name = "s",
      descriptor = "I"
   )
   public static int field7998;
   @OriginalMember(
      owner = "client!iba",
      name = "m",
      descriptor = "I"
   )
   public static int field8002;
   @OriginalMember(
      owner = "client!iba",
      name = "q",
      descriptor = "I"
   )
   public static int field8003;
   @OriginalMember(
      owner = "client!iba",
      name = "r",
      descriptor = "I"
   )
   public static int field8006;
   @OriginalMember(
      owner = "client!iba",
      name = "v",
      descriptor = "I"
   )
   public static int field8007;
   @OriginalMember(
      owner = "client!iba",
      name = "n",
      descriptor = "Lcf;"
   )
   private class631 field8000;

   @OriginalMember(
      owner = "client!iba",
      name = "<init>",
      descriptor = "(Lea;Lds;)V",
      line = 5
   )
   public class558(class573 arg0, class16 arg1) {
      super(arg0);

      try {
         this.field7999 = arg1;
         this.method4002(false);
         this.field8004 = new class673(super.field157, 6406, 2, new byte[]{0, -1}, 6406);
         this.field8004.method4893(false, false);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8008[8] + (arg0 != null ? field8008[0] : field8008[2]) + ',' + (arg1 != null ? field8008[0] : field8008[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(II)Lgs;",
      line = 17
   )
   public static final class49 method4001(int arg0, int arg1) {
      try {
         ++field7996;
         class49 var2 = (class49)class328.field4478.method5069((byte)-97, (long)arg1);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = class595.field8745.method2037(false, 0, arg1);
            if (var3 != null && var3.length > 1) {
               class49 var4;
               try {
                  if (arg0 != 1) {
                     method4003((byte[])null, -63);
                  }

                  var4 = class377.method2856(var3, (byte)50);
               } catch (Exception var7) {
                  throw new RuntimeException(var7.getMessage() + field8008[6] + arg1);
               }

               class328.field4478.method5068((long)arg1, var4, -57);
               return var4;
            } else {
               return null;
            }
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field8008[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "b",
      descriptor = "(Z)V",
      line = 44
   )
   private final void method4002(boolean arg0) {
      try {
         ++field7995;
         this.field8000 = new class631(super.field157, 2);
         this.field8000.method4569(0, (byte)-107);
         super.field157.method4112((byte)-126, 1);
         super.field157.method4117(7681, 260, -1);
         super.field157.method4096(0, (byte)15, 34168, 768);
         OpenGL.glTexGeni(8192, 9472, 9216);
         OpenGL.glEnable(3168);
         super.field157.method4112((byte)9, 0);
         OpenGL.glTexEnvf(8960, 34163, 2.0F);
         if (this.field7999.field179) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[]{0.0F, 0.0F, 0.0F, 1.0F}, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
         }

         this.field8000.method4570(256);
         this.field8000.method4569(1, (byte)-100);
         if (arg0) {
            field8005 = null;
         }

         super.field157.method4112((byte)-92, 1);
         super.field157.method4117(8448, 8448, -1);
         super.field157.method4096(0, (byte)15, 5890, 768);
         OpenGL.glDisable(3168);
         super.field157.method4112((byte)112, 0);
         OpenGL.glTexEnvf(8960, 34163, 1.0F);
         if (this.field7999.field179) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
         }

         this.field8000.method4570(256);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8008[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(IZ)V",
      line = 90
   )
   public final void method88(int arg0, boolean arg1) {
      try {
         super.field157.method4117(260, 8448, -1);
         if (arg0 != 16) {
            method4004(-79);
         }

         ++field8007;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8008[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "([BI)Ljava/lang/String;",
      line = 102
   )
   public static final String method4003(byte[] arg0, int arg1) {
      try {
         ++field7998;
         return arg1 != -18145 ? null : class405.method3054(0, arg0.length, 43, arg0);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8008[1] + (arg0 != null ? field8008[0] : field8008[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(ZI)V",
      line = 114
   )
   public final void method84(boolean arg0, int arg1) {
      try {
         ++field8003;
         if (~super.field157.field8390 < -1) {
            float var3 = -0.5F / (float)super.field157.field8390;
            super.field157.method4112((byte)114, 1);
            class129.field1647[2] = var3;
            class129.field1647[3] = super.field157.field8392 * var3 + 0.25F;
            class129.field1647[0] = 0.0F;
            class129.field1647[1] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class129.field1647, 0);
            OpenGL.glPopMatrix();
            super.field157.method4120(true, 0.5F, (float)super.field157.field8390);
            super.field157.method4107(104, this.field8004);
            super.field157.method4112((byte)-100, 0);
         }

         this.field8000.method4571(false, '\u0000');
         OpenGL.glMatrixMode(5890);
         OpenGL.glPushMatrix();
         OpenGL.glScalef(0.25F, 0.25F, 1.0F);
         if (arg1 != 13254) {
            this.method85(-45);
         }

         OpenGL.glMatrixMode(5888);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8008[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "b",
      descriptor = "(I)V",
      line = 148
   )
   public final void method85(int arg0) {
      try {
         ++field7997;
         this.field8000.method4571(false, '\u0001');
         if (~super.field157.field8390 < -1) {
            super.field157.method4112((byte)-122, 1);
            super.field157.method4107(-123, (class486)null);
            super.field157.method4120(true, 1.0F, 0.0F);
            super.field157.method4112((byte)107, 0);
         }

         super.field157.method4117(8448, 8448, -1);
         OpenGL.glMatrixMode(5890);
         OpenGL.glPopMatrix();
         OpenGL.glMatrixMode(5888);
         if (arg0 != 17328) {
            this.field8000 = null;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8008[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(BLsl;I)V",
      line = 171
   )
   public final void method86(byte arg0, class486 arg1, int arg2) {
      try {
         if (arg0 >= 75) {
            ++field8006;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8008[9] + arg0 + ',' + (arg1 != null ? field8008[0] : field8008[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(I)Z",
      line = 181
   )
   public final boolean method87(int arg0) {
      try {
         if (arg0 >= -49) {
            field8001 = null;
         }

         ++field7994;
         return true;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8008[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "c",
      descriptor = "(I)V",
      line = 193
   )
   public static void method4004(int arg0) {
      try {
         if (arg0 != 260) {
            field8001 = null;
         }

         field8001 = null;
         field8005 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8008[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "a",
      descriptor = "(III)V",
      line = 206
   )
   public final void method82(int arg0, int arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         label40: {
            ++field8002;
            if (~(arg1 & 1) == -2) {
               if (this.field7999.field179) {
                  super.field157.method4107(28, this.field7999.field189);
                  class129.field1647[3] = (float)(super.field157.field8355 % 4000) / 4000.0F;
                  class129.field1647[2] = 0.0F;
                  class129.field1647[0] = 0.0F;
                  class129.field1647[1] = 0.0F;
                  OpenGL.glTexGenfv(8194, 9473, class129.field1647, 0);
                  if (!var4) {
                     break label40;
                  }
               }

               int var5 = super.field157.field8355 % 4000 * 16 / 4000;
               super.field157.method4107(104, this.field7999.field184[var5]);
               if (!var4) {
                  break label40;
               }
            }

            if (!this.field7999.field179) {
               super.field157.method4107(arg0 + -13834, this.field7999.field184[0]);
               if (!var4) {
                  break label40;
               }
            }

            super.field157.method4107(-121, this.field7999.field189);
            class129.field1647[2] = 0.0F;
            class129.field1647[0] = 0.0F;
            class129.field1647[1] = 0.0F;
            class129.field1647[3] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class129.field1647, 0);
         }

         if (arg0 != 13880) {
            this.method84(true, -123);
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field8008[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4005(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 35);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4006(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 122;
            break;
         case 1:
            var10005 = 44;
            break;
         case 2:
            var10005 = 43;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 35;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
