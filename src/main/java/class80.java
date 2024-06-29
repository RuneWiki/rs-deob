import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class80 extends class316 {
   @OriginalMember(
      owner = "client!u",
      name = "e",
      descriptor = "Ltaa;"
   )
   private class426 field1365;
   @OriginalMember(
      owner = "client!u",
      name = "l",
      descriptor = "Llt;"
   )
   private class702 field1367;
   @OriginalMember(
      owner = "client!u",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1370 = new String[]{method814(method813("\t(\u001f\u001b\u0005")), method814(method813("\u0007(u\u001d")), method814(method813("\u001cs]Y")), method814(method813("\u0007(t\u001d")), method814(method813("\u0007(r\u001d")), method814(method813("\u0007(v\u001d")), method814(method813("\u0007(s\u001d")), method814(method813("\u0007(p\u001d")), method814(method813("\u0007(w\u001d")), method814(method813("\u0007(\r\\\u0016\u001br\u000f\u001d")), method814(method813("\u0007(x\u001d")), method814(method813("\u0007(y\u001d"))};
   @OriginalMember(
      owner = "client!u",
      name = "k",
      descriptor = "I"
   )
   public static int field1359;
   @OriginalMember(
      owner = "client!u",
      name = "h",
      descriptor = "I"
   )
   public static int field1361;
   @OriginalMember(
      owner = "client!u",
      name = "j",
      descriptor = "I"
   )
   public static int field1362;
   @OriginalMember(
      owner = "client!u",
      name = "d",
      descriptor = "I"
   )
   public static int field1363;
   @OriginalMember(
      owner = "client!u",
      name = "m",
      descriptor = "I"
   )
   public static int field1364;
   @OriginalMember(
      owner = "client!u",
      name = "g",
      descriptor = "I"
   )
   public static int field1366;
   @OriginalMember(
      owner = "client!u",
      name = "i",
      descriptor = "I"
   )
   public static int field1368;
   @OriginalMember(
      owner = "client!u",
      name = "f",
      descriptor = "I"
   )
   public static int field1369;
   @OriginalMember(
      owner = "client!u",
      name = "c",
      descriptor = "[Lsfa;"
   )
   public static class723[] field1360;

   @OriginalMember(
      owner = "client!u",
      name = "a",
      descriptor = "(IILufa;)V",
      line = 4
   )
   public final void method804(int arg0, int arg1, class707 arg2) {
      try {
         if (arg0 == 0) {
            super.field4567.method252(arg2, (byte)-11);
            ++field1363;
            super.field4567.method322(-126, arg1);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field1370[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1370[0] : field1370[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!u",
      name = "a",
      descriptor = "(I)V",
      line = 16
   )
   public final void method805(int arg0) {
      try {
         this.field1367.method5117('\u0001', 5);
         ++field1368;
         super.field4567.method259(32, 1);
         super.field4567.method252((class707)null, (byte)-127);
         super.field4567.method259(32, 0);
         int var2 = -21 / ((arg0 - -18) / 63);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1370[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!u",
      name = "a",
      descriptor = "(BZ)V",
      line = 33
   )
   public final void method806(byte arg0, boolean arg1) {
      try {
         ++field1361;
         this.field1367.method5117('\u0000', 5);
         if (this.field1365.field6173) {
            super.field4567.method259(32, 1);
            super.field4567.method252(this.field1365.field6171, (byte)-68);
            super.field4567.method259(32, 0);
         }

         int var3 = 37 % ((-44 - arg0) / 38);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field1370[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!u",
      name = "b",
      descriptor = "(I)Z",
      line = 51
   )
   public final boolean method807(int arg0) {
      try {
         ++field1366;
         if (arg0 != -18913) {
            method812(74, (short[])null, -32, -53, (String[])null);
         }

         return true;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1370[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!u",
      name = "c",
      descriptor = "(I)V",
      line = 62
   )
   public static void method808(int arg0) {
      try {
         if (arg0 > -115) {
            method809((byte)-83);
         }

         field1360 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1370[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!u",
      name = "a",
      descriptor = "(B)[Lpg;",
      line = 73
   )
   public static final class762[] method809(byte arg0) {
      try {
         if (arg0 != 67) {
            field1360 = null;
         }

         ++field1362;
         return new class762[]{class628.field9136, class124.field2023, class211.field3152, class392.field5784, class402.field5938, class538.field7841, class93.field1516};
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1370[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!u",
      name = "a",
      descriptor = "(III)V",
      line = 85
   )
   public final void method810(int arg0, int arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         float var5;
         float var6;
         float var7;
         label35: {
            ++field1369;
            var5 = (float)((arg0 & 3) - -1) * -5.0E-4F;
            var6 = (float)((arg0 >> 3 & 3) + 1) * 5.0E-4F;
            var7 = (arg0 & 64) != arg2 ? 9.765625E-4F : 4.8828125E-4F;
            boolean var8 = ~(128 & arg0) != -1;
            super.field4567.method259(32, 1);
            if (!var8) {
               class309.field4445[1] = 0.0F;
               class309.field4445[0] = 0.0F;
               class309.field4445[2] = var7;
               class309.field4445[3] = 0.0F;
               if (!var4) {
                  break label35;
               }
            }

            class309.field4445[0] = var7;
            class309.field4445[1] = 0.0F;
            class309.field4445[3] = 0.0F;
            class309.field4445[2] = 0.0F;
         }

         label30: {
            OpenGL.glTexGenfv(8192, 9474, class309.field4445, 0);
            class309.field4445[2] = 0.0F;
            class309.field4445[1] = var7;
            class309.field4445[3] = (float)super.field4567.field728 * var5 % 1.0F;
            class309.field4445[0] = 0.0F;
            OpenGL.glTexGenfv(8193, 9474, class309.field4445, 0);
            if (this.field1365.field6173) {
               class309.field4445[3] = (float)super.field4567.field728 * var6 % 1.0F;
               class309.field4445[1] = 0.0F;
               class309.field4445[0] = 0.0F;
               class309.field4445[2] = 0.0F;
               OpenGL.glTexGenfv(8194, 9473, class309.field4445, 0);
               if (!var4) {
                  break label30;
               }
            }

            int var9 = (int)((float)super.field4567.field728 * var6 * 16.0F);
            super.field4567.method252(this.field1365.field6176[var9 % 16], (byte)-103);
         }

         super.field4567.method259(32, 0);
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field1370[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!u",
      name = "<init>",
      descriptor = "(Lrk;Ltaa;)V",
      line = 141
   )
   public class80(class35 arg0, class426 arg1) {
      super(arg0);

      try {
         this.field1365 = arg1;
         this.field1367 = new class702(arg0, 2);
         this.field1367.method5116((byte)111, 0);
         super.field4567.method259(32, 1);
         if (this.field1365.field6173) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
         }

         OpenGL.glTexGeni(8192, 9472, 9216);
         OpenGL.glTexGeni(8193, 9472, 9216);
         OpenGL.glEnable(3168);
         OpenGL.glEnable(3169);
         super.field4567.method259(32, 0);
         this.field1367.method5115((byte)-38);
         this.field1367.method5116((byte)111, 1);
         super.field4567.method259(32, 1);
         if (this.field1365.field6173) {
            OpenGL.glDisable(3170);
         }

         OpenGL.glDisable(3168);
         OpenGL.glDisable(3169);
         super.field4567.method259(32, 0);
         this.field1367.method5115((byte)-99);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1370[9] + (arg0 != null ? field1370[0] : field1370[2]) + ',' + (arg1 != null ? field1370[0] : field1370[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!u",
      name = "b",
      descriptor = "(BZ)V",
      line = 176
   )
   public final void method811(byte arg0, boolean arg1) {
      try {
         if (arg0 != 51) {
            field1360 = null;
         }

         ++field1364;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1370[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!u",
      name = "a",
      descriptor = "(I[SII[Ljava/lang/String;)V",
      line = 187
   )
   public static final void method812(int param0, short[] param1, int param2, int param3, String[] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!u",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method813(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 120);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!u",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method814(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 114;
            break;
         case 1:
            var10005 = 6;
            break;
         case 2:
            var10005 = 49;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 120;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
