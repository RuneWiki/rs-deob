import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class580 extends class573 {
   @OriginalMember(
      owner = "client!cba",
      name = "y",
      descriptor = "I"
   )
   private int field7959;
   @OriginalMember(
      owner = "client!cba",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7965 = new String[]{method4173(method4172("&y?\u0012&")), method4173(method4172(">5p\u0012g49xHeu")), method4173(method4172("3\"}P")), method4173(method4172(">5p\u0012\u0018u")), method4173(method4172(">5p\u0012\u0019u")), method4173(method4172(">5p\u0012\u001au")), method4173(method4172(">5p\u0012\u001fu"))};
   @OriginalMember(
      owner = "client!cba",
      name = "B",
      descriptor = "[F"
   )
   public static float[] field7962 = new float[4];
   @OriginalMember(
      owner = "client!cba",
      name = "z",
      descriptor = "[I"
   )
   public static int[] field7964 = new int[5];
   @OriginalMember(
      owner = "client!cba",
      name = "x",
      descriptor = "I"
   )
   public static int field7958;
   @OriginalMember(
      owner = "client!cba",
      name = "v",
      descriptor = "I"
   )
   public static int field7960;
   @OriginalMember(
      owner = "client!cba",
      name = "w",
      descriptor = "I"
   )
   public static int field7963;
   @OriginalMember(
      owner = "client!cba",
      name = "A",
      descriptor = "[Lnaa;"
   )
   public static class78[] field7961;

   @OriginalMember(
      owner = "client!cba",
      name = "a",
      descriptor = "(IBIILjv;I)V"
   )
   public static final void method4169(int arg0, byte arg1, int arg2, int arg3, class87 arg4, int arg5) {
      boolean var6 = client.field4273;

      try {
         ++field7960;
         if (arg0 >= 1 && arg3 >= 1 && arg0 <= class507.field7030 + -2 && class215.field2667 + -2 >= arg3) {
            if (class111.field1404 == null) {
               return;
            }

            class712 var7 = class620.field8662.method2880(arg2, arg0, arg5, true, arg3);
            if (var7 != null) {
               label71: {
                  if (var7 instanceof class771) {
                     ((class771)var7).method5518(0, arg4);
                     if (!var6) {
                        break label71;
                     }
                  }

                  if (var7 instanceof class398) {
                     ((class398)var7).method3022((byte)86, arg4);
                     if (!var6) {
                        break label71;
                     }
                  }

                  if (var7 instanceof class627) {
                     ((class627)var7).method4562(arg4, 31205);
                     if (!var6) {
                        break label71;
                     }
                  }

                  if (var7 instanceof class314) {
                     ((class314)var7).method2360(1158671849, arg4);
                  }
               }
            }
         }

         if (arg1 != -76) {
            method4171(-4);
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field7965[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field7965[0] : field7965[2]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cba",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method317(int arg0) {
      try {
         if (arg0 != 0) {
            this.method4170(true, 92);
         }

         ++field7958;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7965[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cba",
      name = "<init>",
      descriptor = "(Lor;II[BI)V"
   )
   public class580(class670 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
      super(arg0, 3552, arg1, arg2, false);

      try {
         this.field7959 = arg2;
         super.field7877.method4848(false, this);
         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glTexImage1Dub(super.field7876, 0, super.field7890, this.field7959, 0, arg4, 5121, arg3, 0);
         OpenGL.glPixelStorei(3317, 4);
         this.method4129(-1323776991, true);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field7965[1] + (arg0 != null ? field7965[0] : field7965[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7965[0] : field7965[2]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cba",
      name = "b",
      descriptor = "(ZI)V"
   )
   public final void method4170(boolean arg0, int arg1) {
      try {
         super.field7877.method4848(false, this);
         if (arg1 != 33071) {
            this.field7959 = -93;
         }

         ++field7963;
         OpenGL.glTexParameteri(super.field7876, 10242, !arg0 ? 33071 : 10497);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7965[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cba",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method4171(int arg0) {
      try {
         if (arg0 == 3552) {
            field7961 = null;
            field7962 = null;
            field7964 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7965[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4172(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 91);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4173(char[] arg0) {
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
            var10005 = 87;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 60;
            break;
         default:
            var10005 = 91;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
