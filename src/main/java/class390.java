import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class390 {
   @OriginalMember(
      owner = "client!bw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5688 = new String[]{method3033(method3032("\u0012\u0004V\u0006I")), method3033(method3032("\u0012\u0004V\u0005I")), method3033(method3032("\u0012\u0004V\u0007I"))};
   @OriginalMember(
      owner = "client!bw",
      name = "h",
      descriptor = "Lfm;"
   )
   public static class164 field5673 = new class164(73, 16);
   @OriginalMember(
      owner = "client!bw",
      name = "p",
      descriptor = "B"
   )
   public byte field5667;
   @OriginalMember(
      owner = "client!bw",
      name = "c",
      descriptor = "B"
   )
   public byte field5668;
   @OriginalMember(
      owner = "client!bw",
      name = "e",
      descriptor = "B"
   )
   public byte field5671;
   @OriginalMember(
      owner = "client!bw",
      name = "s",
      descriptor = "B"
   )
   public byte field5675;
   @OriginalMember(
      owner = "client!bw",
      name = "l",
      descriptor = "B"
   )
   public byte field5677;
   @OriginalMember(
      owner = "client!bw",
      name = "i",
      descriptor = "B"
   )
   public byte field5679;
   @OriginalMember(
      owner = "client!bw",
      name = "r",
      descriptor = "B"
   )
   public byte field5681;
   @OriginalMember(
      owner = "client!bw",
      name = "f",
      descriptor = "I"
   )
   public static int field5669;
   @OriginalMember(
      owner = "client!bw",
      name = "j",
      descriptor = "I"
   )
   public static int field5676;
   @OriginalMember(
      owner = "client!bw",
      name = "v",
      descriptor = "I"
   )
   public int field5678;
   @OriginalMember(
      owner = "client!bw",
      name = "b",
      descriptor = "I"
   )
   public int field5686;
   @OriginalMember(
      owner = "client!bw",
      name = "u",
      descriptor = "I"
   )
   public int field5687;
   @OriginalMember(
      owner = "client!bw",
      name = "d",
      descriptor = "S"
   )
   public short field5674;
   @OriginalMember(
      owner = "client!bw",
      name = "a",
      descriptor = "Z"
   )
   public boolean field5666;
   @OriginalMember(
      owner = "client!bw",
      name = "k",
      descriptor = "Z"
   )
   public boolean field5670;
   @OriginalMember(
      owner = "client!bw",
      name = "m",
      descriptor = "Z"
   )
   public boolean field5672;
   @OriginalMember(
      owner = "client!bw",
      name = "t",
      descriptor = "Z"
   )
   public boolean field5680;
   @OriginalMember(
      owner = "client!bw",
      name = "n",
      descriptor = "Z"
   )
   public boolean field5682;
   @OriginalMember(
      owner = "client!bw",
      name = "q",
      descriptor = "Z"
   )
   public boolean field5683;
   @OriginalMember(
      owner = "client!bw",
      name = "o",
      descriptor = "Z"
   )
   public boolean field5684;
   @OriginalMember(
      owner = "client!bw",
      name = "g",
      descriptor = "Z"
   )
   public boolean field5685;

   @OriginalMember(
      owner = "client!bw",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3029(int arg0) {
      try {
         if (arg0 != 0) {
            method3031(2, (byte)-117);
         }

         field5673 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5688[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3030(byte arg0) {
      boolean var1 = client.field10022;

      try {
         int var2 = 0;
         int var10000;
         int var10001;
         if (var1) {
            var10000 = class315.method2562((byte)-101, class701.field10102, class249.field3818 + var2);
            var10001 = class590.field8352;
         } else if (var2 >= class701.field10102) {
            var10000 = arg0;
            var10001 = 93;
            if (!var1) {
               if (arg0 != 93) {
                  field5673 = null;
               }

               ++field5676;
               return;
            }
         } else {
            var10000 = class315.method2562((byte)-101, class701.field10102, class249.field3818 + var2);
            var10001 = class590.field8352;
         }

         while(true) {
            int var3 = var10000 * var10001;
            int var4 = 0;
            if (var1 || var4 < class590.field8352) {
               do {
                  int var5 = var3 + class315.method2562((byte)-34, class590.field8352, var4 - -class19.field257);
                  if (class614.field8733[var5] == class599.field8520) {
                     class558.field7928[var5].method632(0, 0, class502.field7168, class466.field6765, class502.field7168 * var4, class466.field6765 * var2, true, true);
                  }

                  ++var4;
               } while(var4 < class590.field8352);
            }

            ++var2;
            if (var2 >= class701.field10102) {
               var10000 = arg0;
               var10001 = 93;
               if (!var1) {
                  if (arg0 != 93) {
                     field5673 = null;
                  }

                  ++field5676;
                  return;
               }
            } else {
               var10000 = class315.method2562((byte)-101, class701.field10102, class249.field3818 + var2);
               var10001 = class590.field8352;
            }
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field5688[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method3031(int arg0, byte arg1) {
      try {
         class107 var2 = class545.field7775;
         synchronized(class545.field7775) {
            class545.field7775.method1048(arg0, -8543);
         }

         ++field5669;
         class107 var3 = class211.field3013;
         synchronized(class211.field3013) {
            class211.field3013.method1048(arg0, arg1 ^ -8541);
            if (arg1 != 2) {
               method3030((byte)48);
            }

         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field5688[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3032(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 97);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3033(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 112;
            break;
         case 1:
            var10005 = 115;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 97;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
