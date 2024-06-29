import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class705 extends class29 {
   @OriginalMember(
      owner = "client!fb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10242 = new String[]{method5134(method5133(")[K\u0014!")), method5134(method5133(")[K\u0010!")), method5134(method5133(")[K\u0016!")), method5134(method5133(")[K\u0013!")), method5134(method5133("4\u0017K|t")), method5134(method5133("!L\t>")), method5134(method5133(")[K\u0011!")), method5134(method5133("u\u0019")), method5134(method5133(")[K\u0017!"))};
   @OriginalMember(
      owner = "client!fb",
      name = "t",
      descriptor = "Lnw;"
   )
   public static class616 field10238 = new class616(83, 2);
   @OriginalMember(
      owner = "client!fb",
      name = "u",
      descriptor = "I"
   )
   public static int field10236;
   @OriginalMember(
      owner = "client!fb",
      name = "s",
      descriptor = "I"
   )
   public static int field10237;
   @OriginalMember(
      owner = "client!fb",
      name = "p",
      descriptor = "I"
   )
   public static int field10239;
   @OriginalMember(
      owner = "client!fb",
      name = "q",
      descriptor = "I"
   )
   public static int field10240;
   @OriginalMember(
      owner = "client!fb",
      name = "r",
      descriptor = "I"
   )
   public static int field10241;

   @OriginalMember(
      owner = "client!fb",
      name = "c",
      descriptor = "(Z)V"
   )
   public static void method5129(boolean arg0) {
      try {
         if (arg0) {
            field10238 = null;
         }

         field10238 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10242[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "(B[SI)[S"
   )
   public static final short[] method5130(byte arg0, short[] arg1, int arg2) {
      try {
         ++field10236;
         if (arg0 >= -115) {
            method5131((String)null, -73);
         }

         short[] var3 = new short[arg2];
         class714.method5194(arg1, 0, var3, 0, arg2);
         return var3;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10242[3] + arg0 + ',' + (arg1 != null ? field10242[4] : field10242[5]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public static final void method5131(String arg0, int arg1) {
      boolean var2 = client.field4273;

      try {
         ++field10240;
         if (class440.field6113 == null) {
            class636.method4616(false);
         }

         class483.field6656.setTime(new Date(class792.method5708(-25005)));
         int var3 = class483.field6656.get(11);
         int var4 = class483.field6656.get(12);
         int var5 = class483.field6656.get(13);
         String var6 = Integer.toString(var3 / 10) + var3 % 10 + ":" + var4 / 10 + var4 % 10 + ":" + var5 / 10 + var5 % 10;
         String[] var7 = class249.method1870('\n', arg0, false);
         int var8 = arg1;
         if (var2 || ~arg1 > ~var7.length) {
            do {
               int var9 = class86.field1112;
               if (var2) {
                  class440.field6113[var9] = class440.field6113[var9 + -1];
                  --var9;
               }

               while(true) {
                  while(~var9 < -1) {
                     class440.field6113[var9] = class440.field6113[var9 + -1];
                     --var9;
                  }

                  class440.field6113[0] = var6 + field10242[7] + var7[var8];
                  if (!var2) {
                     if (class464.field6362 != null) {
                        try {
                           class464.field6362.write(class374.method2896(class440.field6113[0] + "\n", -32483));
                        } catch (IOException var11) {
                        }
                     }

                     if (~class86.field1112 > ~(class440.field6113.length - 1)) {
                        if (class107.field1367 > 0) {
                           ++class107.field1367;
                        }

                        ++class86.field1112;
                     }

                     ++var8;
                     break;
                  }

                  --var9;
               }
            } while(~var8 > ~var7.length);

         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field10242[6] + (arg0 != null ? field10242[4] : field10242[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fb",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method238(byte arg0) {
      try {
         if (arg0 != 112) {
            field10238 = null;
         }

         ++field10239;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10242[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fb",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V"
   )
   public class705(OggStreamState arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method5132(int arg0, int arg1) {
      try {
         ++field10241;
         if (arg1 != 19829) {
            return false;
         } else {
            return arg0 == 0 || ~arg0 == -2 || ~arg0 == -3;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10242[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "(ILjagtheora/ogg/OggPacket;)V"
   )
   public final void method242(int arg0, OggPacket arg1) {
      try {
         ++field10237;
         if (arg0 != 16) {
            method5130((byte)-74, (short[])null, 18);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field10242[8] + arg0 + ',' + (arg1 != null ? field10242[4] : field10242[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5133(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 9);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5134(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 57;
            break;
         case 2:
            var10005 = 101;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 9;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
