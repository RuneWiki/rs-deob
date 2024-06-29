import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class95 {
   @OriginalMember(
      owner = "client!cba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1291 = new String[]{method888(method887("\u001aynJ\u001aQ")), method888(method887("\u001aynJ\u001bQ")), method888(method887("\u001aynJ\u001dQ")), method888(method887("\u001aynJ\u001cQ")), method888(method887("\u0017nc\b")), method888(method887("\u001aynJ\u0018Q")), method888(method887("\u00025!J$")), method888(method887("\u001aynJ-\u0016H{\u00160\u0017|'"))};
   @OriginalMember(
      owner = "client!cba",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field1287 = new int[13];
   @OriginalMember(
      owner = "client!cba",
      name = "d",
      descriptor = "Laka;"
   )
   public static class418 field1289 = new class418(105, 16);
   @OriginalMember(
      owner = "client!cba",
      name = "f",
      descriptor = "I"
   )
   public static int field1283;
   @OriginalMember(
      owner = "client!cba",
      name = "c",
      descriptor = "I"
   )
   public static int field1284;
   @OriginalMember(
      owner = "client!cba",
      name = "h",
      descriptor = "I"
   )
   public static int field1285;
   @OriginalMember(
      owner = "client!cba",
      name = "b",
      descriptor = "I"
   )
   public static int field1286;
   @OriginalMember(
      owner = "client!cba",
      name = "a",
      descriptor = "I"
   )
   public static int field1288;
   @OriginalMember(
      owner = "client!cba",
      name = "g",
      descriptor = "I"
   )
   public static int field1290;

   @OriginalMember(
      owner = "client!cba",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method882(int arg0, int arg1) {
      try {
         ++field1286;
         if (~class757.field11093.field10992.method3943(arg1 + -18035) == -1) {
            arg0 = -1;
         }

         if (~class433.field5906 != ~arg0) {
            if (~arg0 != 0) {
               label33: {
                  class559 var2 = class215.field2731.method5039((byte)30, arg0);
                  class65 var3 = var2.method4211((byte)-3);
                  if (var3 != null) {
                     class366.field5092.method5336((byte)37, var3.method583(), var3.method590(), var3.method576(), new Point(var2.field8190, var2.field8195), class590.field8691);
                     class433.field5906 = arg0;
                     if (!client.field1481) {
                        break label33;
                     }
                  }

                  arg0 = -1;
               }
            }

            if (arg1 != 2) {
               method882(68, 3);
            }

            if (arg0 == -1 && class433.field5906 != -1) {
               class366.field5092.method5336((byte)37, -1, (int[])null, -1, new Point(), class590.field8691);
               class433.field5906 = -1;
            }
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1291[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cba",
      name = "a",
      descriptor = "(Lha;IIILoca;)V"
   )
   public static final void method883(class479 arg0, int arg1, int arg2, int arg3, class642 arg4) {
      boolean var5 = client.field1481;

      try {
         ++field1285;
         int var6 = -55 / ((arg3 - 14) / 53);
         byte var7 = 63;
         byte var8 = 7;
         int var9 = 63;
         if (var5 || var9 >= 0) {
            do {
               int var10 = var9 << 10 & 64512 | var8 << 7 & 896 | var7 & 127;
               class387.method3051(-49, true, false);
               int var11 = class535.field7840[var10];
               class201.method1661(20251, false, true);
               arg0.method513(arg2, ((-var9 + 63) * arg4.field9572 >> 6) + arg1, arg4.field9629, (arg4.field9572 >> 6) - -1, var11, 0);
               --var9;
            } while(var9 >= 0);

         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field1291[5] + (arg0 != null ? field1291[6] : field1291[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1291[6] : field1291[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cba",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field1284;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1291[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cba",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method884(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         int var6;
         int var7;
         label15: {
            ++field1283;
            float var5 = (float)class326.field4486 / (float)class326.field4492;
            var6 = arg2;
            var7 = arg1;
            if (var5 < 1.0F) {
               var7 = (int)((float)arg2 * var5);
               if (!client.field1481) {
                  break label15;
               }
            }

            var6 = (int)((float)arg1 / var5);
         }

         int var10 = arg0 - (-var7 + arg1) / 2;
         int var11 = arg3 - (-var6 + arg2) / arg4;
         class227.field2847 = -1;
         class491.field6864 = -1;
         class381.field5303 = -(class326.field4486 * var10 / var7) + class326.field4486;
         class345.field4731 = class326.field4492 * var11 / var6;
         class541.method4094(true);
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field1291[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cba",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method885(int arg0) {
      try {
         field1287 = null;
         field1289 = null;
         if (arg0 != -7204) {
            method886(false, -9, 58);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1291[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cba",
      name = "a",
      descriptor = "(ZII)Z"
   )
   public static final boolean method886(boolean arg0, int arg1, int arg2) {
      try {
         ++field1288;
         boolean var3 = (55 & arg2) == 0 ? class401.method3144(arg1, (byte)37, arg2) : class49.method370(arg2, arg1, (byte)-119);
         return !arg0 ? false : var3 | ~(arg1 & 65536) != -1 | class615.method4536(arg1, arg2, (byte)117);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1291[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method887(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method888(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 121;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 15;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
