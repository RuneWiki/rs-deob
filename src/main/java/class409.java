import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public abstract class class409 extends class673 {
   @OriginalMember(
      owner = "client!hca",
      name = "l",
      descriptor = "Ljagtheora/ogg/OggStreamState;"
   )
   public OggStreamState field5642;
   @OriginalMember(
      owner = "client!hca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5646 = new String[]{method3216(method3215("pw\u00046")), method3216(method3215("e,Ft\u001f")), method3216(method3215("va\tt,6")), method3216(method3215("va\tt-6")), method3216(method3215("va\tt/6")), method3216(method3215("va\tt^wl\u0001.\\6"))};
   @OriginalMember(
      owner = "client!hca",
      name = "o",
      descriptor = "I"
   )
   public int field5640;
   @OriginalMember(
      owner = "client!hca",
      name = "n",
      descriptor = "I"
   )
   public static int field5641;
   @OriginalMember(
      owner = "client!hca",
      name = "m",
      descriptor = "I"
   )
   public static int field5643;
   @OriginalMember(
      owner = "client!hca",
      name = "p",
      descriptor = "I"
   )
   public static int field5644;
   @OriginalMember(
      owner = "client!hca",
      name = "q",
      descriptor = "I"
   )
   public static int field5645;

   @OriginalMember(
      owner = "client!hca",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method3212(int arg0) {
      try {
         if (~class216.field2742 <= -1) {
            long var1;
            label25: {
               var1 = class163.method1353(-121);
               class216.field2742 = (int)((long)class216.field2742 - (-class785.field11471 + var1));
               if (class216.field2742 > 0) {
                  int var3 = (class216.field2742 << 8) / class113.field1508;
                  int var4 = -var3 + 255;
                  float var5 = (float)var3 / 255.0F;
                  float var6 = 1.0F - var5;
                  class439.field5974 = (-16711936 & (16711935 & class615.field9064) * var3 - -((16711935 & class66.field842.field3077) * var4)) + (16711680 & (class615.field9064 & 65280) * var3 + (class66.field842.field3077 & 65280) * var4) >>> 8;
                  class382.field5307 = class726.field10604 * var3 + class66.field842.field3084 * var4 >> 8;
                  class232.field2886 = (-class35.field490 + class66.field842.field3089) * var6 + class35.field490;
                  class380.field5296 = (class66.field842.field3085 - class170.field2214) * var6 + class170.field2214;
                  class115.field1523 = (class66.field842.field3074 - class428.field5817) * var6 + class428.field5817;
                  class259.field3292 = (class66.field842.field3082 - class42.field554) * var6 + class42.field554;
                  class773.field11262 = (-16711936 & (class479.field6666 & 16711935) * var3 - -((class66.field842.field3075 & 16711935) * var4)) + (16711680 & (class479.field6666 & 65280) * var3 + (65280 & class66.field842.field3075) * var4) >>> 8;
                  class457.field6296 = (class66.field842.field3090 - class30.field435) * var6 + class30.field435;
                  class172.field2230 = (class66.field842.field3076 - class650.field9712) * var6 + class650.field9712;
                  if (class20.field318 == class66.field842.field3078) {
                     break label25;
                  }

                  class58.field762 = class577.field8555.method407(class20.field318, class66.field842.field3078, var6, class58.field762);
                  if (!client.field1481) {
                     break label25;
                  }
               }

               class172.field2230 = class66.field842.field3076;
               class439.field5974 = class66.field842.field3077;
               class115.field1523 = class66.field842.field3074;
               class457.field6296 = class66.field842.field3090;
               class380.field5296 = class66.field842.field3085;
               class259.field3292 = class66.field842.field3082;
               class58.field762 = class66.field842.field3078;
               class382.field5307 = class66.field842.field3084;
               class773.field11262 = class66.field842.field3075;
               class216.field2742 = -1;
               class232.field2886 = class66.field842.field3089;
            }

            class785.field11471 = var1;
         }

         ++field5645;
         if (arg0 != -29164) {
            method3212(-3);
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field5646[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hca",
      name = "b",
      descriptor = "(ILjagtheora/ogg/OggPacket;)V"
   )
   public final void method3213(int arg0, OggPacket arg1) {
      try {
         if (arg0 >= -63) {
            method3214(105, -41, 115);
         }

         this.method1015(0, arg1);
         ++field5643;
         ++this.field5640;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5646[2] + arg0 + ',' + (arg1 != null ? field5646[1] : field5646[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hca",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method1017(int arg0);

   @OriginalMember(
      owner = "client!hca",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3214(int arg0, int arg1, int arg2) {
      try {
         ++field5644;
         if (arg2 != -10879) {
            method3212(-65);
         }

         return ~(arg0 & 2048) != -1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5646[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hca",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V"
   )
   public class409(OggStreamState arg0) {
      try {
         this.field5642 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5646[5] + (arg0 != null ? field5646[1] : field5646[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hca",
      name = "a",
      descriptor = "(ILjagtheora/ogg/OggPacket;)V"
   )
   public abstract void method1015(int arg0, OggPacket arg1);

   @OriginalMember(
      owner = "client!hca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3215(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 98);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3216(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 30;
            break;
         case 1:
            var10005 = 2;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 98;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
