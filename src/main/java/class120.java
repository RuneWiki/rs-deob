import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public abstract class class120 extends class294 {
   @OriginalMember(
      owner = "client!lfa",
      name = "p",
      descriptor = "Ljagtheora/ogg/OggStreamState;"
   )
   public OggStreamState field1698;
   @OriginalMember(
      owner = "client!lfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1703 = new String[]{method1116(method1115("\u00036~\u000e\u001d")), method1116(method1115("\u0014~1\u000e.P")), method1116(method1115("\u0016m<L")), method1116(method1115("\u0014~1\u000e,P")), method1116(method1115(",Nj\u0000")), method1116(method1115("\u0014~1\u000e+P")), method1116(method1115("B8")), method1116(method1115("\u0014~1\u000e-P")), method1116(method1115("\u0014~1\u000e\\\u0011v9T^P"))};
   @OriginalMember(
      owner = "client!lfa",
      name = "m",
      descriptor = "Ldha;"
   )
   public static class642 field1695 = new class642("", 10);
   @OriginalMember(
      owner = "client!lfa",
      name = "n",
      descriptor = "Luk;"
   )
   public static class498 field1700 = new class498(63, 1);
   @OriginalMember(
      owner = "client!lfa",
      name = "q",
      descriptor = "Lnaa;"
   )
   public static class113 field1701 = new class113(56, 4);
   @OriginalMember(
      owner = "client!lfa",
      name = "t",
      descriptor = "I"
   )
   public static int field1693;
   @OriginalMember(
      owner = "client!lfa",
      name = "s",
      descriptor = "I"
   )
   public static int field1694;
   @OriginalMember(
      owner = "client!lfa",
      name = "o",
      descriptor = "I"
   )
   public static int field1696;
   @OriginalMember(
      owner = "client!lfa",
      name = "r",
      descriptor = "I"
   )
   public static int field1697;
   @OriginalMember(
      owner = "client!lfa",
      name = "v",
      descriptor = "I"
   )
   public int field1699;
   @OriginalMember(
      owner = "client!lfa",
      name = "u",
      descriptor = "I"
   )
   public static int field1702;

   @OriginalMember(
      owner = "client!lfa",
      name = "a",
      descriptor = "(I)V",
      line = 6
   )
   public static void method1110(int arg0) {
      try {
         field1701 = null;
         if (arg0 < 119) {
            method1110(-12);
         }

         field1695 = null;
         field1700 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1703[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "a",
      descriptor = "(BLjava/lang/String;)V",
      line = 22
   )
   public static final void method1111(byte arg0, String arg1) {
      boolean var2 = client.field1786;

      try {
         if (arg0 != 93) {
            field1700 = null;
         }

         ++field1693;
         if (class168.field2568 == null) {
            class659.method4852((byte)31);
         }

         class81.field1151.setTime(new Date(class162.method1442(14080)));
         int var3 = class81.field1151.get(11);
         int var4 = class81.field1151.get(12);
         int var5 = class81.field1151.get(13);
         String var6 = Integer.toString(var3 / 10) + var3 % 10 + ":" + var4 / 10 + var4 % 10 + ":" + var5 / 10 + var5 % 10;
         String[] var7 = class9.method53(arg1, '\n', (byte)-103);
         int var8 = 0;
         if (var2 || var8 < var7.length) {
            do {
               int var9 = class276.field4408;
               if (var2) {
                  class168.field2568[var9] = class168.field2568[var9 + -1];
                  --var9;
               }

               while(true) {
                  while(~var9 < -1) {
                     class168.field2568[var9] = class168.field2568[var9 + -1];
                     --var9;
                  }

                  class168.field2568[0] = var6 + field1703[6] + var7[var8];
                  if (!var2) {
                     if (class511.field7816 != null) {
                        try {
                           class511.field7816.write(class761.method5580((byte)95, class168.field2568[0] + "\n"));
                        } catch (IOException var11) {
                        }
                     }

                     if (class168.field2568.length - 1 > class276.field4408) {
                        if (class701.field10451 > 0) {
                           ++class701.field10451;
                        }

                        ++class276.field4408;
                     }

                     ++var8;
                     break;
                  }

                  --var9;
               }
            } while(var8 < var7.length);

         }
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field1703[5] + arg0 + ',' + (arg1 != null ? field1703[0] : field1703[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "a",
      descriptor = "(ILjagtheora/ogg/OggPacket;)V",
      line = 89
   )
   public final void method1112(int arg0, OggPacket arg1) {
      try {
         if (arg0 < -24) {
            ++field1696;
            this.method1113(arg1, 97);
            ++this.field1699;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1703[1] + arg0 + ',' + (arg1 != null ? field1703[0] : field1703[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V",
      line = 100
   )
   public class120(OggStreamState arg0) {
      try {
         this.field1698 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1703[8] + (arg0 != null ? field1703[0] : field1703[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "a",
      descriptor = "(B)V",
      line = 111
   )
   public static final void method1114(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "b",
      descriptor = "(I)V"
   )
   public abstract void method1109(int arg0);

   @OriginalMember(
      owner = "client!lfa",
      name = "a",
      descriptor = "(Ljagtheora/ogg/OggPacket;I)V"
   )
   public abstract void method1113(OggPacket arg0, int arg1);

   @OriginalMember(
      owner = "client!lfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1115(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1116(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 24;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
