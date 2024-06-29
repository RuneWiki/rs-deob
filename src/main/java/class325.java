import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class325 {
   @OriginalMember(
      owner = "client!gea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4837 = new String[]{method2614(method2613(")N\u0002eif")), method2614(method2613("$J\u0015*\u0005\"J\r,\u0005#J\r*L+F\u0006%_`f\u0002%J)N\u000e.E:m\u0002(_!Y\u001a")), method2614(method2613(" N\u0014\u001bG/_\u0005$Y#f;\tN/E39D6R")), method2614(method2613("-D\u000eeX;EM&J J\u0004.F+E\u0017ec!_0;D:o\n*L D\u0010?B-f;\tN/E")), method2614(method2613(")N\u0017\u001bG/_\u0005$Y#f!.J x\u00069]+Y")), method2614(method2613("-D\u000eeX;EM&J J\u0004.F+E\u0017q_7[\u0006vc!_0;D:o\n*L D\u0010?B-")), method2614(method2613(")N\u0002ejf")), method2614(method2613("$J\u0015*S`F\u0002%J)N\u000e.E:\u0005.\tN/E0.Y8N\u0011\bD E\u0006(_'D\r")), method2614(method2613("$J\u0015*\u0005\"J\r,\u0005\rG\u00028X")), method2614(method2613("\u0006N\u0002;o;F\u0013kX+_\u0016;\u000b+Y\u0011$Yt")), method2614(method2613("$J\u0015*\u0005\"J\r,\u0005\u001d_\u0011\"E)")), method2614(method2613(")N\u0002ehf"))};
   @OriginalMember(
      owner = "client!gea",
      name = "g",
      descriptor = "Ljava/lang/String;"
   )
   public static String field4831 = null;
   @OriginalMember(
      owner = "client!gea",
      name = "f",
      descriptor = "Lfm;"
   )
   public static class164 field4832 = new class164(41, 6);
   @OriginalMember(
      owner = "client!gea",
      name = "d",
      descriptor = "I"
   )
   public static int field4830;
   @OriginalMember(
      owner = "client!gea",
      name = "c",
      descriptor = "I"
   )
   public static int field4834;
   @OriginalMember(
      owner = "client!gea",
      name = "b",
      descriptor = "Liaa;"
   )
   public static class433 field4833;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!gea",
      name = "e",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field4835;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!gea",
      name = "a",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field4836;

   @OriginalMember(
      owner = "client!gea",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method2609(int arg0, int arg1, int arg2) {
      try {
         if (arg1 <= 55) {
            field4831 = null;
         }

         ++field4834;
         class111 var3 = class796.method5734(18, (long)arg0 | (long)arg2 << 32, (byte)-112);
         var3.method1083(-46);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field4837[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gea",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2610(int arg0) {
      try {
         field4831 = null;
         if (arg0 == -27465) {
            field4833 = null;
            field4832 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4837[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gea",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final synchronized void method2611(boolean arg0) {
      try {
         ++field4830;
         if (class609.field8677 == null) {
            try {
               Class var1 = Class.forName(field4837[1]);
               Method var2 = var1.getDeclaredMethod(field4837[4], (Class[])null);
               Object var3 = var2.invoke((Object)null, (Object[])null);
               Method var4 = var1.getMethod(field4837[2], Class.forName(field4837[7]), field4835 != null ? field4835 : (field4835 = method2612(field4837[10])), field4836 != null ? field4836 : (field4836 = method2612(field4837[8])));
               class609.field8677 = var4.invoke((Object)null, var3, field4837[5], Class.forName(field4837[3]));
               if (!arg0) {
                  method2610(-94);
               }
            } catch (Exception var7) {
               System.out.println(field4837[9]);
               var7.printStackTrace();
            }
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field4837[6] + arg0 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!gea",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method2612(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!gea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2613(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 43);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2614(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 43;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 43;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
