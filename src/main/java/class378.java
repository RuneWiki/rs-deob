import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class378 {
   @OriginalMember(
      owner = "client!ce",
      name = "g",
      descriptor = "[I"
   )
   private int[] field5995;
   @OriginalMember(
      owner = "client!ce",
      name = "l",
      descriptor = "[I"
   )
   private int[] field5994;
   @OriginalMember(
      owner = "client!ce",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6003 = new String[]{method3094(method3093("9{N\n]")), method3094(method3093("9{N\u000f]")), method3094(method3093("9{N\t]")), method3094(method3093("9{N\u000e]")), method3094(method3093("4k\f'")), method3094(method3093("9{Nw\u001c4w\u0014u]")), method3094(method3093("!0Ne\b")), method3094(method3093("9{N\r]")), method3094(method3093("9{N\b]"))};
   @OriginalMember(
      owner = "client!ce",
      name = "d",
      descriptor = "I"
   )
   public static int field6000 = class277.method2331(1600, (byte)124);
   @OriginalMember(
      owner = "client!ce",
      name = "h",
      descriptor = "Luk;"
   )
   public static class498 field6002 = new class498(64, 10);
   @OriginalMember(
      owner = "client!ce",
      name = "j",
      descriptor = "I"
   )
   private int field5990;
   @OriginalMember(
      owner = "client!ce",
      name = "m",
      descriptor = "I"
   )
   public static int field5991;
   @OriginalMember(
      owner = "client!ce",
      name = "c",
      descriptor = "I"
   )
   private int field5992;
   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "I"
   )
   public static int field5993;
   @OriginalMember(
      owner = "client!ce",
      name = "e",
      descriptor = "I"
   )
   public static int field5996;
   @OriginalMember(
      owner = "client!ce",
      name = "k",
      descriptor = "I"
   )
   public static int field5997;
   @OriginalMember(
      owner = "client!ce",
      name = "f",
      descriptor = "I"
   )
   private int field5998;
   @OriginalMember(
      owner = "client!ce",
      name = "b",
      descriptor = "I"
   )
   public static int field5999;
   @OriginalMember(
      owner = "client!ce",
      name = "i",
      descriptor = "I"
   )
   private int field6001;

   @OriginalMember(
      owner = "client!ce",
      name = "d",
      descriptor = "(I)V"
   )
   private final void method3087(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(BII)Z"
   )
   public static final boolean method3088(byte arg0, int arg1, int arg2) {
      try {
         int var3 = -117 % ((arg0 - -22) / 50);
         ++field5999;
         return ~(52 & arg1) != -1;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6003[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method3089(byte arg0) {
      try {
         ++field5991;
         if (arg0 != -18) {
            method3090(99);
         }

         if (this.field5992 == 0) {
            this.method3092(-119);
            this.field5992 = 256;
         }

         return this.field5994[this.field5992 + -1];
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6003[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3090(int arg0) {
      try {
         field6002 = null;
         if (arg0 != 6) {
            method3088((byte)12, 93, -70);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6003[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method3091(int arg0) {
      try {
         if (arg0 != 15072) {
            this.field5992 = 121;
         }

         if (this.field5992 == 0) {
            this.method3092(arg0 + -15198);
            this.field5992 = 256;
         }

         ++field5996;
         return this.field5994[--this.field5992];
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6003[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "b",
      descriptor = "(I)V"
   )
   private final void method3092(int arg0) {
      boolean var2 = client.field1786;

      try {
         ++field5997;
         this.field5998 += ++this.field6001;
         if (arg0 < -113) {
            int var3 = 0;
            if (var2 || var3 < 256) {
               do {
                  int var4;
                  label55: {
                     var4 = this.field5995[var3];
                     if (~(2 & var3) == -1) {
                        if ((1 & var3) != 0) {
                           this.field5990 >>>= 6;
                           if (!var2) {
                              break label55;
                           }
                        }

                        this.field5990 <<= 13;
                        if (!var2) {
                           break label55;
                        }
                     }

                     if ((var3 & 1) != 0) {
                        this.field5990 >>>= 16;
                        if (!var2) {
                           break label55;
                        }
                     }

                     this.field5990 <<= 2;
                  }

                  this.field5990 += this.field5995[var3 + 128 & 255];
                  int var5;
                  this.field5995[var3] = var5 = this.field5998 + this.field5990 + this.field5995[class408.method3277(var4 >> 2, 255)];
                  this.field5994[var3] = this.field5998 = var4 + this.field5995[class408.method3277(var5, 261297) >> 8 >> 2];
                  ++var3;
               } while(var3 < 256);

            }
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field6003[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "<init>",
      descriptor = "()V"
   )
   private class378() {
   }

   @OriginalMember(
      owner = "client!ce",
      name = "<init>",
      descriptor = "([I)V"
   )
   public class378(int[] param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ce",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3093(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 117);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ce",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3094(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 90;
            break;
         case 1:
            var10005 = 30;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
