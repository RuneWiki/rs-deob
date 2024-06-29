import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class7 {
   @OriginalMember(
      owner = "client!ps",
      name = "i",
      descriptor = "[I"
   )
   private int[] field95;
   @OriginalMember(
      owner = "client!ps",
      name = "j",
      descriptor = "[I"
   )
   private int[] field96;
   @OriginalMember(
      owner = "client!ps",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field98 = new String[]{method60(method59("c@\u0017Ji")), method60(method59("c@\u0017Ii")), method60(method59("c@\u0017Ni")), method60(method59("c@\u0017Ki")), method60(method59("c@\u00174(}ZM6i")), method60(method59("h\u001d\u0017&<")), method60(method59("}FUd")), method60(method59("c@\u0017Mi"))};
   @OriginalMember(
      owner = "client!ps",
      name = "h",
      descriptor = "Ldja;"
   )
   public static class45 field88 = new class45(2);
   @OriginalMember(
      owner = "client!ps",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field97 = false;
   @OriginalMember(
      owner = "client!ps",
      name = "f",
      descriptor = "I"
   )
   private int field85;
   @OriginalMember(
      owner = "client!ps",
      name = "m",
      descriptor = "I"
   )
   public static int field86;
   @OriginalMember(
      owner = "client!ps",
      name = "l",
      descriptor = "I"
   )
   private int field87;
   @OriginalMember(
      owner = "client!ps",
      name = "k",
      descriptor = "I"
   )
   public static int field89;
   @OriginalMember(
      owner = "client!ps",
      name = "g",
      descriptor = "I"
   )
   private int field90;
   @OriginalMember(
      owner = "client!ps",
      name = "d",
      descriptor = "I"
   )
   public static int field91;
   @OriginalMember(
      owner = "client!ps",
      name = "b",
      descriptor = "I"
   )
   public static int field92;
   @OriginalMember(
      owner = "client!ps",
      name = "e",
      descriptor = "I"
   )
   public static int field93;
   @OriginalMember(
      owner = "client!ps",
      name = "a",
      descriptor = "I"
   )
   private int field94;

   @OriginalMember(
      owner = "client!ps",
      name = "a",
      descriptor = "()V"
   )
   public static final void method53() {
      class422.field5749 = class422.field5751;
   }

   @OriginalMember(
      owner = "client!ps",
      name = "a",
      descriptor = "(I)V"
   )
   private final void method54(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ps",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method55(byte arg0) {
      try {
         if (arg0 <= 20) {
            field97 = true;
         }

         field88 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field98[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ps",
      name = "a",
      descriptor = "(B)V"
   )
   private final void method56(byte arg0) {
      boolean var2 = client.field1481;

      try {
         if (arg0 != -60) {
            field88 = null;
         }

         ++field91;
         this.field85 += ++this.field87;
         int var3 = 0;
         if (var2 || var3 < 256) {
            do {
               int var4;
               label55: {
                  var4 = this.field96[var3];
                  if ((2 & var3) == 0) {
                     if ((var3 & 1) == 0) {
                        this.field94 <<= 13;
                        if (!var2) {
                           break label55;
                        }
                     }

                     this.field94 >>>= 6;
                     if (!var2) {
                        break label55;
                     }
                  }

                  if (~(1 & var3) == -1) {
                     this.field94 <<= 2;
                     if (!var2) {
                        break label55;
                     }
                  }

                  this.field94 >>>= 16;
               }

               this.field94 += this.field96[255 & var3 + 128];
               int var5;
               this.field96[var3] = var5 = this.field94 + this.field96[class109.method974(var4, 1020) >> 2] + this.field85;
               this.field95[var3] = this.field85 = this.field96[class109.method974(261144, var5) >> 8 >> 2] - -var4;
               ++var3;
            } while(var3 < 256);

         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field98[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ps",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method57(byte arg0) {
      try {
         if (this.field90 == 0) {
            this.method56((byte)-60);
            this.field90 = 256;
         }

         ++field93;
         if (arg0 >= -97) {
            this.field87 = 100;
         }

         return this.field95[--this.field90];
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field98[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ps",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method58(int arg0) {
      try {
         ++field89;
         if (~this.field90 == -1) {
            this.method56((byte)-60);
            this.field90 = 256;
         }

         return arg0 != 256 ? -15 : this.field95[this.field90 - 1];
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field98[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ps",
      name = "<init>",
      descriptor = "()V"
   )
   private class7() {
   }

   @OriginalMember(
      owner = "client!ps",
      name = "<init>",
      descriptor = "([I)V"
   )
   public class7(int[] param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ps",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method59(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 65);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ps",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method60(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 51;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 65;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
