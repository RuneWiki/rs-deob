import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class667 extends class409 {
   @OriginalMember(
      owner = "client!ow",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9886 = new String[]{method4875(method4874("I\u0004\u000byD")), method4875(method4874("I\u0004\u000b|D")), method4875(method4874("I\u0004\u000b\u007fD")), method4875(method4874("]]\u000b\u0010\u0011")), method4875(method4874("u&g")), method4875(method4874("H\u0006IR")), method4875(method4874("I\u0004\u000bxD")), method4875(method4874("I\u0004\u000b{D")), method4875(method4874("I\u0004\u000b}D")), method4875(method4874("I\u0004\u000bzD"))};
   @OriginalMember(
      owner = "client!ow",
      name = "x",
      descriptor = "I"
   )
   public static int field9881 = 0;
   @OriginalMember(
      owner = "client!ow",
      name = "v",
      descriptor = "F"
   )
   private float field9876;
   @OriginalMember(
      owner = "client!ow",
      name = "t",
      descriptor = "F"
   )
   private float field9877;
   @OriginalMember(
      owner = "client!ow",
      name = "s",
      descriptor = "I"
   )
   public static int field9871;
   @OriginalMember(
      owner = "client!ow",
      name = "A",
      descriptor = "I"
   )
   public static int field9873;
   @OriginalMember(
      owner = "client!ow",
      name = "B",
      descriptor = "I"
   )
   public static int field9874;
   @OriginalMember(
      owner = "client!ow",
      name = "u",
      descriptor = "I"
   )
   private int field9875;
   @OriginalMember(
      owner = "client!ow",
      name = "y",
      descriptor = "I"
   )
   private int field9878;
   @OriginalMember(
      owner = "client!ow",
      name = "E",
      descriptor = "I"
   )
   public static int field9880;
   @OriginalMember(
      owner = "client!ow",
      name = "w",
      descriptor = "I"
   )
   public static int field9882;
   @OriginalMember(
      owner = "client!ow",
      name = "C",
      descriptor = "I"
   )
   public static int field9884;
   @OriginalMember(
      owner = "client!ow",
      name = "F",
      descriptor = "Lgj;"
   )
   public static class736 field9879;
   @OriginalMember(
      owner = "client!ow",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private String field9872;
   @OriginalMember(
      owner = "client!ow",
      name = "D",
      descriptor = "Ljava/lang/String;"
   )
   private String field9883;
   @OriginalMember(
      owner = "client!ow",
      name = "r",
      descriptor = "Ljava/lang/String;"
   )
   private String field9885;

   @OriginalMember(
      owner = "client!ow",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1017(int arg0) {
      try {
         ++field9880;
         if (arg0 >= -126) {
            this.method4869(29);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9886[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "c",
      descriptor = "(I)Ljava/lang/String;"
   )
   public final String method4869(int arg0) {
      try {
         if (arg0 < 31) {
            return null;
         } else {
            ++field9882;
            return this.field9885;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9886[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method4870(int arg0) {
      try {
         field9879 = null;
         if (arg0 != 0) {
            method4870(-16);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9886[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V"
   )
   public class667(OggStreamState arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!ow",
      name = "h",
      descriptor = "(I)F"
   )
   public final float method4871(int arg0) {
      try {
         if (arg0 != 0) {
            this.method4869(-126);
         }

         ++field9874;
         return this.field9876;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9886[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "a",
      descriptor = "(B)F"
   )
   public final float method4872(byte arg0) {
      try {
         ++field9871;
         if (arg0 != -86) {
            this.field9883 = null;
         }

         return this.field9877;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9886[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "i",
      descriptor = "(I)Ljava/lang/String;"
   )
   public final String method4873(int arg0) {
      try {
         ++field9873;
         if (arg0 != 0) {
            this.method1015(-60, (OggPacket)null);
         }

         return this.field9883;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9886[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "a",
      descriptor = "(ILjagtheora/ogg/OggPacket;)V"
   )
   public final void method1015(int arg0, OggPacket arg1) {
      try {
         ++field9884;
         if (~super.field5640 >= -1 || field9886[4].equals(this.field9872)) {
            label93: {
               class66 var3 = new class66(arg1.getData());
               int var4 = var3.method640(255);
               if (~super.field5640 >= -9) {
                  if ((128 | var4) == 0) {
                     throw new IllegalStateException();
                  }

                  if (super.field5640 != 0) {
                     break label93;
                  }

                  var3.field864 += 23;
                  this.field9878 = var3.method657(0);
                  this.field9875 = var3.method657(arg0);
                  if (~this.field9878 == -1 || this.field9875 == 0) {
                     throw new IllegalStateException();
                  }

                  class66 var5 = new class66(16);
                  var3.method632(0, 16, (byte)35, var5.field859);
                  this.field9885 = var5.method606(11856);
                  var5.field864 = 0;
                  var3.method632(0, 16, (byte)35, var5.field859);
                  this.field9872 = var5.method606(arg0 + 11856);
                  if (!client.field1481) {
                     break label93;
                  }
               }

               if (var4 == 0) {
                  long var6 = var3.method639((byte)-117);
                  long var8 = var3.method639((byte)-117);
                  long var10 = var3.method639((byte)-117);
                  if (var6 < 0L || var8 < 0L || var10 < 0L || ~var6 > ~var10) {
                     throw new IllegalStateException();
                  }

                  this.field9876 = (float)((long)this.field9875 * var6) / (float)this.field9878;
                  this.field9877 = (float)((var6 - -var8) * (long)this.field9875) / (float)this.field9878;
                  int var12 = var3.method657(0);
                  if (~var12 > -1 || ~var12 < ~(var3.field859.length + -var3.field864)) {
                     throw new IllegalStateException();
                  }

                  this.field9883 = class697.method5078(var12, var3.field864, (byte)108, var3.field859);
               }

               if ((var4 | 128) != 0) {
                  return;
               }
            }

            if (arg0 != 0) {
               this.field9875 = -19;
            }
         }
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field9886[6] + arg0 + ',' + (arg1 != null ? field9886[3] : field9886[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ow",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4874(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 108);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ow",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4875(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 38;
            break;
         case 1:
            var10005 = 115;
            break;
         case 2:
            var10005 = 37;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 108;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
