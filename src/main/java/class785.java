import jaggl.OpenGL;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class785 extends class476 implements class196 {
   @OriginalMember(
      owner = "client!mca",
      name = "A",
      descriptor = "I"
   )
   private int field11517;
   @OriginalMember(
      owner = "client!mca",
      name = "x",
      descriptor = "I"
   )
   private int field11519;
   @OriginalMember(
      owner = "client!mca",
      name = "z",
      descriptor = "I"
   )
   private int field11522;
   @OriginalMember(
      owner = "client!mca",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11524 = new String[]{method5703(method5702("`+2\u00012%")), method5703(method5702("vf}\u0001\n")), method5703(method5702("c=?C")), method5703(method5702("`+2\u0001Kd&:[I%")), method5703(method5702("R*?N\u0019f")), method5703(method5702("`+2\u00013%")), method5703(method5702("a'4H\u0012i'&[")), method5703(method5702("R<<_")), method5703(method5702("`+2\u00015%"))};
   @OriginalMember(
      owner = "client!mca",
      name = "B",
      descriptor = "Luk;"
   )
   public static class498 field11520 = new class498(88, 6);
   @OriginalMember(
      owner = "client!mca",
      name = "w",
      descriptor = "I"
   )
   public static int field11518;
   @OriginalMember(
      owner = "client!mca",
      name = "y",
      descriptor = "I"
   )
   public static int field11521;
   @OriginalMember(
      owner = "client!mca",
      name = "C",
      descriptor = "I"
   )
   public static int field11523;

   @OriginalMember(
      owner = "client!mca",
      name = "<init>",
      descriptor = "(Lcka;Leh;III[B)V",
      line = 4
   )
   public class785(class174 arg0, class19 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
      super(arg0, 32879, arg1, class650.field9371, arg3 * arg4 * arg2, false);

      try {
         this.field11517 = arg2;
         this.field11519 = arg3;
         this.field11522 = arg4;
         super.field7244.method2193(this, (byte)-19);
         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glTexImage3Dub(super.field7248, 0, this.method3704(-8760), this.field11517, this.field11519, this.field11522, 0, class158.method1412(50, super.field7246), 5121, arg5, 0);
         OpenGL.glPixelStorei(3317, 4);
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field11524[3] + (arg0 != null ? field11524[1] : field11524[2]) + ',' + (arg1 != null ? field11524[1] : field11524[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field11524[1] : field11524[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mca",
      name = "b",
      descriptor = "(Z)V",
      line = 20
   )
   public static void method5699(boolean arg0) {
      try {
         field11520 = null;
         if (!arg0) {
            method5700((String)null, 110, -110, (class289)null, (String)null);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11524[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mca",
      name = "a",
      descriptor = "(Ljava/lang/String;IILsu;Ljava/lang/String;)Lbja;",
      line = 33
   )
   public static final class275 method5700(String arg0, int arg1, int arg2, class289 arg3, String arg4) {
      try {
         ++field11523;
         if (~arg1 == -1) {
            return arg3.method2436((byte)119, arg4);
         } else if (~arg1 == -2) {
            try {
               Object var5 = class676.method4988(new Object[]{(new URL(class684.field10176.getCodeBase(), arg4)).toString()}, arg0, class684.field10176, 22523);
               if (var5 == null) {
                  throw new RuntimeException();
               } else {
                  class275 var6 = new class275();
                  var6.field4398 = 1;
                  return var6;
               }
            } catch (Throwable var13) {
               class275 var7 = new class275();
               var7.field4398 = 2;
               return var7;
            }
         } else if (arg2 > -4) {
            return null;
         } else if (arg1 == 2) {
            try {
               class684.field10176.getAppletContext().showDocument(new URL(class684.field10176.getCodeBase(), arg4), field11524[4]);
               class275 var8 = new class275();
               var8.field4398 = 1;
               return var8;
            } catch (Exception var14) {
               class275 var9 = new class275();
               var9.field4398 = 2;
               return var9;
            }
         } else if (~arg1 == -4) {
            try {
               class676.method4989(class684.field10176, field11524[6], -23226);
            } catch (Throwable var16) {
            }

            try {
               class684.field10176.getAppletContext().showDocument(new URL(class684.field10176.getCodeBase(), arg4), field11524[7]);
               class275 var10 = new class275();
               var10.field4398 = 1;
               return var10;
            } catch (Exception var15) {
               class275 var11 = new class275();
               var11.field4398 = 2;
               return var11;
            }
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var17) {
         throw class482.method3757(var17, field11524[5] + (arg0 != null ? field11524[1] : field11524[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field11524[1] : field11524[2]) + ',' + (arg4 != null ? field11524[1] : field11524[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mca",
      name = "a",
      descriptor = "(B)V",
      line = 120
   )
   public static final void method5701(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5702(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5703(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 13;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 83;
            break;
         case 3:
            var10005 = 47;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
