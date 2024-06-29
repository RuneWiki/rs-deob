import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class13 extends class644 {
   @OriginalMember(
      owner = "client!cg",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private String field249 = null;
   @OriginalMember(
      owner = "client!cg",
      name = "t",
      descriptor = "J"
   )
   private long field251 = -1L;
   @OriginalMember(
      owner = "client!cg",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field255 = new String[]{method116(method115("^\bK\u0015")), method116(method115("S\u001a\t<a")), method116(method115("KS\tW4")), method116(method115("S\u001a\t:a")), method116(method115("S\u001a\t=a")), method116(method115("S\u001a\t;a")), method116(method115("S\u001a\t8a"))};
   @OriginalMember(
      owner = "client!cg",
      name = "y",
      descriptor = "Lqb;"
   )
   public static class68 field246 = new class68();
   @OriginalMember(
      owner = "client!cg",
      name = "w",
      descriptor = "Lifa;"
   )
   public static class75 field252 = new class75(8, -1);
   @OriginalMember(
      owner = "client!cg",
      name = "u",
      descriptor = "I"
   )
   public static int field247;
   @OriginalMember(
      owner = "client!cg",
      name = "x",
      descriptor = "I"
   )
   public static int field248;
   @OriginalMember(
      owner = "client!cg",
      name = "s",
      descriptor = "I"
   )
   public static int field250;
   @OriginalMember(
      owner = "client!cg",
      name = "A",
      descriptor = "I"
   )
   public static int field254;
   @OriginalMember(
      owner = "client!cg",
      name = "v",
      descriptor = "Lkv;"
   )
   public static class19 field253;

   @OriginalMember(
      owner = "client!cg",
      name = "a",
      descriptor = "(Lww;II)Lpd;"
   )
   public static final class648 method110(class339 arg0, int arg1, int arg2) {
      try {
         ++field247;
         if (arg2 != 255) {
            method112((byte)80);
         }

         class648 var3 = (class648)class625.field9234.method3192((long)arg1, (byte)-125);
         if (var3 == null) {
            label27: {
               if (class723.field10570) {
                  var3 = class629.field9294.method402(class65.method577(arg0, arg1), true);
                  if (!client.field1481) {
                     break label27;
                  }
               }

               var3 = class462.method3522(arg0.method2700(arg1, -2), false);
            }

            class625.field9234.method3190(var3, (long)arg1, arg2 + -247);
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field255[4] + (arg0 != null ? field255[2] : field255[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cg",
      name = "a",
      descriptor = "(ILgea;)V"
   )
   public final void method111(int arg0, class66 arg1) {
      try {
         if (arg1.method640(arg0 + 244) != 255) {
            --arg1.field864;
            this.field251 = arg1.method660(110);
         }

         if (arg0 != 11) {
            method110((class339)null, 36, -33);
         }

         ++field248;
         this.field249 = arg1.method654((byte)-118);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field255[1] + arg0 + ',' + (arg1 != null ? field255[2] : field255[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cg",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method112(byte arg0) {
      try {
         field252 = null;
         field253 = null;
         if (arg0 != -28) {
            field246 = null;
         }

         field246 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field255[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cg",
      name = "a",
      descriptor = "(ILjava/awt/Canvas;)V"
   )
   public static final void method113(int arg0, Canvas arg1) {
      try {
         ++field254;
         Dimension var2 = arg1.getSize();
         class316.method2503(var2.width, (byte)101, var2.height);
         if (arg0 != 11026) {
            method112((byte)25);
         }

         if (~class175.field2258 == -2) {
            class497.field6954.method496(arg1, class713.field10470, class345.field4735);
         } else {
            class497.field6954.method496(arg1, class197.field2522, class429.field5829);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field255[6] + arg0 + ',' + (arg1 != null ? field255[2] : field255[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cg",
      name = "a",
      descriptor = "(ILkd;)V"
   )
   public final void method114(int arg0, class790 arg1) {
      try {
         arg1.method5700(this.field249, -11777, this.field251);
         ++field250;
         if (arg0 != 19163) {
            method112((byte)25);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field255[5] + arg0 + ',' + (arg1 != null ? field255[2] : field255[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method115(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 73);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method116(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 48;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 121;
            break;
         default:
            var10005 = 73;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
