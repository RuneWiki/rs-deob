import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class690 {
   @OriginalMember(
      owner = "client!qba",
      name = "k",
      descriptor = "Liw;"
   )
   private class107 field9942 = new class107(256);
   @OriginalMember(
      owner = "client!qba",
      name = "i",
      descriptor = "Ld;"
   )
   private class672 field9941;
   @OriginalMember(
      owner = "client!qba",
      name = "b",
      descriptor = "Laea;"
   )
   private class678 field9939;
   @OriginalMember(
      owner = "client!qba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9943 = new String[]{method5011(method5010("\"\u0018;]")), method5011(method5010("7Cy\u001f,")), method5011(method5010("=\u000f6\u001fm%\u0003>Eod")), method5011(method5010("=\u000f6\u001f\u0015d")), method5011(method5010("=\u000f6\u001f\u0012d")), method5011(method5010("=\u000f6\u001f\u0010d")), method5011(method5010("=\u000f6\u001f\u0013d"))};
   @OriginalMember(
      owner = "client!qba",
      name = "f",
      descriptor = "Lhha;"
   )
   public static class724 field9932 = new class724(129, 2);
   @OriginalMember(
      owner = "client!qba",
      name = "e",
      descriptor = "I"
   )
   public static int field9933;
   @OriginalMember(
      owner = "client!qba",
      name = "c",
      descriptor = "I"
   )
   public static int field9934;
   @OriginalMember(
      owner = "client!qba",
      name = "g",
      descriptor = "I"
   )
   public static int field9936;
   @OriginalMember(
      owner = "client!qba",
      name = "a",
      descriptor = "I"
   )
   public static int field9937;
   @OriginalMember(
      owner = "client!qba",
      name = "j",
      descriptor = "I"
   )
   public static int field9938;
   @OriginalMember(
      owner = "client!qba",
      name = "h",
      descriptor = "I"
   )
   public static int field9940;
   @OriginalMember(
      owner = "client!qba",
      name = "d",
      descriptor = "Lcj;"
   )
   public static class526 field9935;

   @OriginalMember(
      owner = "client!qba",
      name = "a",
      descriptor = "(BI)Lmn;"
   )
   public final class8 method5006(byte arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field9934;
         Object var4 = this.field9942.method1041((long)arg1, 8);
         if (var4 != null) {
            return (class8)var4;
         } else if (!this.field9941.method2036(arg1, (byte)-92)) {
            return null;
         } else {
            if (arg0 != 121) {
               method5008((byte)115);
            }

            class390 var5;
            class8 var8;
            label77: {
               var5 = this.field9941.method2043(-63, arg1);
               int var6 = !var5.field5685 ? this.field9939.field9668 : 64;
               if (!var5.field5666 || !this.field9939.method237()) {
                  int[] var7;
                  label78: {
                     if (var5.field5678 == 2 || !class130.method1325((byte)3, var5.field5668)) {
                        var7 = this.field9941.method2042(0.7F, arg1, false, var6, var6, true);
                        if (!var3) {
                           break label78;
                        }
                     }

                     var7 = this.field9941.method2038(0.7F, var6, true, arg1, var6, -23361);
                  }

                  var8 = new class8(this.field9939, 3553, 6408, var6, var6, var5.field5675 != 0, var7, 0, 0, false);
                  if (!var3) {
                     break label77;
                  }
               }

               float[] var9 = this.field9941.method2035(var6, false, var6, arg1, 0.7F, (byte)105);
               var8 = new class8(this.field9939, 3553, 34842, var6, var6, var5.field5675 != 0, var9, 6408);
            }

            var8.method67(var5.field5682, 43, var5.field5672);
            this.field9942.method1050(-128, var8, (long)arg1);
            return var8;
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field9943[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qba",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method5007(int arg0) {
      try {
         this.field9942.method1048(5, -8543);
         ++field9940;
         if (arg0 != -17062) {
            method5008((byte)-45);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9943[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qba",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5008(byte arg0) {
      try {
         field9935 = null;
         field9932 = null;
         if (arg0 != 48) {
            field9936 = -40;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9943[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qba",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method5009(int arg0) {
      try {
         this.field9942.method1052(true);
         ++field9933;
         if (arg0 <= 79) {
            field9938 = 63;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9943[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qba",
      name = "<init>",
      descriptor = "(Laea;Ld;)V"
   )
   public class690(class678 arg0, class672 arg1) {
      try {
         this.field9941 = arg1;
         this.field9939 = arg0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9943[2] + (arg0 != null ? field9943[1] : field9943[0]) + ',' + (arg1 != null ? field9943[1] : field9943[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5010(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 81);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5011(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 76;
            break;
         case 1:
            var10005 = 109;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 49;
            break;
         default:
            var10005 = 81;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
