import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vha")
public class class683 extends class416 {
   @OriginalMember(
      owner = "client!vha",
      name = "d",
      descriptor = "Z"
   )
   private boolean field10172 = false;
   @OriginalMember(
      owner = "client!vha",
      name = "g",
      descriptor = "Luf;"
   )
   private class701 field10166;
   @OriginalMember(
      owner = "client!vha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10175 = new String[]{method5051(method5050("GiU\"\u0006\u0019")), method5051(method5050("_tX`")), method5051(method5050("GiU\"\u0005\u0019")), method5051(method5050("J/\u001a\">")), method5051(method5050("GiU\"\u0007\u0019")), method5051(method5050("GiU\"\u007fXo]x}\u0019")), method5051(method5050("GiU\"\u0002\u0019")), method5051(method5050("GiU\"\u0004\u0019")), method5051(method5050("GiU\"\u0000\u0019")), method5051(method5050("GiU\"\u0001\u0019")), method5051(method5050("GiU\"\u000b\u0019"))};
   @OriginalMember(
      owner = "client!vha",
      name = "m",
      descriptor = "I"
   )
   public static int field10167 = 0;
   @OriginalMember(
      owner = "client!vha",
      name = "n",
      descriptor = "I"
   )
   public static int field10163;
   @OriginalMember(
      owner = "client!vha",
      name = "o",
      descriptor = "I"
   )
   public static int field10164;
   @OriginalMember(
      owner = "client!vha",
      name = "j",
      descriptor = "I"
   )
   public static int field10165;
   @OriginalMember(
      owner = "client!vha",
      name = "e",
      descriptor = "I"
   )
   public static int field10168;
   @OriginalMember(
      owner = "client!vha",
      name = "h",
      descriptor = "I"
   )
   public static int field10169;
   @OriginalMember(
      owner = "client!vha",
      name = "l",
      descriptor = "I"
   )
   public static int field10170;
   @OriginalMember(
      owner = "client!vha",
      name = "i",
      descriptor = "I"
   )
   public static int field10171;
   @OriginalMember(
      owner = "client!vha",
      name = "f",
      descriptor = "I"
   )
   public static int field10173;
   @OriginalMember(
      owner = "client!vha",
      name = "k",
      descriptor = "Lrr;"
   )
   public static class678 field10174;

   @OriginalMember(
      owner = "client!vha",
      name = "a",
      descriptor = "(I[B)[B"
   )
   public static final byte[] method5048(int arg0, byte[] arg1) {
      try {
         ++field10165;
         if (arg1 == null) {
            return null;
         } else {
            byte[] var2 = new byte[arg1.length];
            class107.method1027(arg1, 0, var2, 0, arg1.length);
            if (arg0 != 34165) {
               field10174 = null;
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10175[7] + arg0 + ',' + (arg1 != null ? field10175[3] : field10175[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vha",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method1828(boolean arg0, boolean arg1) {
      try {
         super.field6445.method4803(8448, 7681, true);
         if (arg0) {
            this.field10166 = null;
         }

         ++field10168;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10175[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vha",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method1833(int arg0, int arg1, int arg2) {
      try {
         if (arg1 >= -90) {
            this.field10172 = true;
         }

         ++field10173;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field10175[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vha",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method1827(byte arg0) {
      try {
         label20: {
            if (!this.field10172) {
               super.field6445.method4737(111, 0, 770, 5890);
               if (!client.field1786) {
                  break label20;
               }
            }

            this.field10166.method5160((byte)-76, '\u0001');
            super.field6445.method4787(-123, 1);
            super.field6445.method4792(-26367, (class799)null);
            super.field6445.method4787(-81, 0);
         }

         ++field10170;
         super.field6445.method4803(8448, 8448, true);
         this.field10172 = false;
         if (arg0 != 77) {
            method5049(true);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10175[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vha",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method1830(byte arg0) {
      try {
         ++field10169;
         int var2 = 38 % ((-8 - arg0) / 57);
         return true;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10175[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vha",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method1831(boolean arg0, int arg1) {
      try {
         label32: {
            ++field10164;
            class553 var3 = super.field6445.method4811(105);
            if (this.field10166 == null || var3 == null || !arg0) {
               super.field6445.method4737(arg1 + -3103, 0, 770, 34168);
               if (!client.field1786) {
                  break label32;
               }
            }

            this.field10166.method5160((byte)-76, '\u0000');
            super.field6445.method4787(arg1 ^ -3240, 1);
            super.field6445.method4792(arg1 + -29578, var3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field6445.field9651.method1558(false), 0);
            OpenGL.glMatrixMode(5888);
            super.field6445.method4787(-84, 0);
            this.field10172 = true;
         }

         if (arg1 != 3211) {
            field10174 = null;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field10175[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vha",
      name = "a",
      descriptor = "(Lvda;IB)V"
   )
   public final void method1826(class799 arg0, int arg1, byte arg2) {
      try {
         ++field10171;
         super.field6445.method4792(-26367, arg0);
         super.field6445.method4765(arg1, (byte)-3);
         if (arg2 >= -29) {
            this.method1826((class799)null, -70, (byte)125);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field10175[2] + (arg0 != null ? field10175[3] : field10175[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vha",
      name = "<init>",
      descriptor = "(Lc;)V"
   )
   public class683(class652 arg0) {
      super(arg0);

      try {
         if (arg0.field9654) {
            this.field10166 = new class701(arg0, 2);
            this.field10166.method5162(0, -6177);
            super.field6445.method4787(-69, 1);
            super.field6445.method4803(34165, 7681, true);
            super.field6445.method4809(770, (byte)-128, 34168, 2);
            super.field6445.method4737(125, 0, 770, 34167);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field6445.method4787(-99, 0);
            this.field10166.method5163(-3623);
            this.field10166.method5162(1, -6177);
            super.field6445.method4787(-63, 1);
            super.field6445.method4803(8448, 8448, true);
            super.field6445.method4809(770, (byte)-128, 34166, 2);
            super.field6445.method4737(104, 0, 770, 5890);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field6445.method4787(-88, 0);
            this.field10166.method5163(-3623);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10175[5] + (arg0 != null ? field10175[3] : field10175[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vha",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method5049(boolean arg0) {
      try {
         if (arg0) {
            method5048(15, (byte[])null);
         }

         field10174 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10175[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5050(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5051(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 49;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 12;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
