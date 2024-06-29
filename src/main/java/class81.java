import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public class class81 {
   @OriginalMember(
      owner = "client!eia",
      name = "h",
      descriptor = "Llj;"
   )
   private class304 field1143 = new class304(64);
   @OriginalMember(
      owner = "client!eia",
      name = "r",
      descriptor = "Llj;"
   )
   public class304 field1154 = new class304(50);
   @OriginalMember(
      owner = "client!eia",
      name = "d",
      descriptor = "Llj;"
   )
   public class304 field1155 = new class304(5);
   @OriginalMember(
      owner = "client!eia",
      name = "j",
      descriptor = "Lrr;"
   )
   public class678 field1145;
   @OriginalMember(
      owner = "client!eia",
      name = "k",
      descriptor = "Lrr;"
   )
   private class678 field1147;
   @OriginalMember(
      owner = "client!eia",
      name = "i",
      descriptor = "Z"
   )
   public boolean field1138;
   @OriginalMember(
      owner = "client!eia",
      name = "q",
      descriptor = "Ltv;"
   )
   public class311 field1137;
   @OriginalMember(
      owner = "client!eia",
      name = "g",
      descriptor = "I"
   )
   private int field1150;
   @OriginalMember(
      owner = "client!eia",
      name = "m",
      descriptor = "[Ljava/lang/String;"
   )
   private String[] field1156;
   @OriginalMember(
      owner = "client!eia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1158 = new String[]{method795(method794("\u0007/,~\u0014J")), method795(method794("\u0007/,~\u0013J")), method795(method794("\f3!<")), method795(method794("\u0019hc~-")), method795(method794("\u0007/,~l\u000b($$nJ")), method795(method794("\u0007/,~\u0015J")), method795(method794("\u0007/,~\u0018J")), method795(method794("\u0007/,~\u0011J")), method795(method794("\u0007/,~\u0017J")), method795(method794("\u0007/,~\u0016J")), method795(method794("\u0007/,~\u0012J"))};
   @OriginalMember(
      owner = "client!eia",
      name = "c",
      descriptor = "Ljava/util/Calendar;"
   )
   public static Calendar field1151 = Calendar.getInstance(TimeZone.getTimeZone(method795(method794("%\u000b\u0019"))));
   @OriginalMember(
      owner = "client!eia",
      name = "a",
      descriptor = "F"
   )
   public static float field1153;
   @OriginalMember(
      owner = "client!eia",
      name = "u",
      descriptor = "I"
   )
   public static int field1139;
   @OriginalMember(
      owner = "client!eia",
      name = "n",
      descriptor = "I"
   )
   public static int field1140;
   @OriginalMember(
      owner = "client!eia",
      name = "e",
      descriptor = "I"
   )
   public static int field1141;
   @OriginalMember(
      owner = "client!eia",
      name = "s",
      descriptor = "I"
   )
   public static int field1142;
   @OriginalMember(
      owner = "client!eia",
      name = "f",
      descriptor = "I"
   )
   public static int field1144;
   @OriginalMember(
      owner = "client!eia",
      name = "t",
      descriptor = "I"
   )
   public static int field1146;
   @OriginalMember(
      owner = "client!eia",
      name = "l",
      descriptor = "I"
   )
   public static int field1148;
   @OriginalMember(
      owner = "client!eia",
      name = "b",
      descriptor = "I"
   )
   public static int field1149;
   @OriginalMember(
      owner = "client!eia",
      name = "p",
      descriptor = "I"
   )
   public int field1157;
   @OriginalMember(
      owner = "client!eia",
      name = "o",
      descriptor = "Lrr;"
   )
   public static class678 field1152;

   @OriginalMember(
      owner = "client!eia",
      name = "a",
      descriptor = "(ZI)V",
      line = 5
   )
   public final void method786(boolean arg0, int arg1) {
      try {
         ++field1144;
         if (!arg0 != !this.field1138) {
            this.field1138 = arg0;
            if (arg1 <= 85) {
               field1152 = null;
            }

            this.method787((byte)-118);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1158[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "a",
      descriptor = "(B)V",
      line = 28
   )
   public final void method787(byte arg0) {
      try {
         class304 var2 = this.field1143;
         synchronized(this.field1143) {
            this.field1143.method2551(true);
         }

         ++field1148;
         class304 var3 = this.field1154;
         synchronized(this.field1154) {
            this.field1154.method2551(true);
         }

         int var4 = 126 % ((-19 - arg0) / 58);
         class304 var5 = this.field1155;
         synchronized(this.field1155) {
            this.field1155.method2551(true);
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field1158[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "a",
      descriptor = "(Z)V",
      line = 48
   )
   public final void method788(boolean arg0) {
      try {
         ++field1141;
         class304 var2 = this.field1154;
         synchronized(this.field1154) {
            this.field1154.method2551(arg0);
         }

         class304 var3 = this.field1155;
         synchronized(this.field1155) {
            this.field1155.method2551(true);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field1158[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "b",
      descriptor = "(B)V",
      line = 65
   )
   public static void method789(byte arg0) {
      try {
         field1152 = null;
         field1151 = null;
         if (arg0 >= -82) {
            method789((byte)-80);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1158[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "a",
      descriptor = "(IB)V",
      line = 78
   )
   public final void method790(int arg0, byte arg1) {
      try {
         class304 var3 = this.field1143;
         synchronized(this.field1143) {
            this.field1143.method2552(arg0, 21533);
         }

         ++field1139;
         class304 var4 = this.field1154;
         synchronized(this.field1154) {
            this.field1154.method2552(arg0, 21533);
         }

         class304 var5 = this.field1155;
         synchronized(this.field1155) {
            int var6 = 21 / (arg1 / 39);
            this.field1155.method2552(arg0, 21533);
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field1158[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "a",
      descriptor = "(BI)Lge;",
      line = 96
   )
   public final class344 method791(byte arg0, int arg1) {
      try {
         ++field1146;
         class304 var3 = this.field1143;
         class344 var4;
         synchronized(this.field1143) {
            var4 = (class344)this.field1143.method2544(false, (long)arg1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class678 var5 = this.field1147;
            byte[] var6;
            synchronized(this.field1147) {
               var6 = this.field1147.method5017(class140.method1282(false, arg1), class565.method4261(arg1, (byte)-44), (byte)71);
            }

            class344 var7 = new class344();
            var7.field5248 = this;
            var7.field5232 = arg1;
            var7.field5242 = (String[])this.field1156.clone();
            if (var6 != null) {
               var7.method2787(new class354(var6), (byte)115);
            }

            var7.method2783(arg0 + 84);
            class304 var8 = this.field1143;
            synchronized(this.field1143) {
               if (arg0 != -84) {
                  return null;
               } else {
                  this.field1143.method2545((long)arg1, 125, var7);
                  return var7;
               }
            }
         }
      } catch (RuntimeException var16) {
         throw class482.method3757(var16, field1158[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "a",
      descriptor = "(I)V",
      line = 132
   )
   public final void method792(int arg0) {
      try {
         ++field1140;
         class304 var2 = this.field1143;
         synchronized(this.field1143) {
            this.field1143.method2554(-111);
         }

         class304 var3 = this.field1154;
         synchronized(this.field1154) {
            this.field1154.method2554(-103);
         }

         class304 var4 = this.field1155;
         synchronized(this.field1155) {
            if (arg0 >= -69) {
               this.method786(true, -65);
            }

            this.field1155.method2554(-104);
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field1158[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "b",
      descriptor = "(IB)V",
      line = 151
   )
   public final void method793(int arg0, byte arg1) {
      try {
         this.field1157 = arg0;
         ++field1149;
         class304 var3 = this.field1154;
         synchronized(this.field1154) {
            if (arg1 >= -109) {
               field1153 = 0.12488789F;
            }

            this.field1154.method2551(true);
         }

         class304 var4 = this.field1155;
         synchronized(this.field1155) {
            this.field1155.method2551(true);
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field1158[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "<init>",
      descriptor = "(Ltv;IZLrr;Lrr;)V",
      line = 188
   )
   public class81(class311 arg0, int arg1, boolean arg2, class678 arg3, class678 arg4) {
      try {
         this.field1145 = arg4;
         this.field1147 = arg3;
         this.field1138 = arg2;
         this.field1137 = arg0;
         this.field1150 = arg1;
         if (this.field1147 != null) {
            int var6 = this.field1147.method5008(-1) + -1;
            this.field1147.method4998((byte)-82, var6);
         }

         if (class619.field9004 != this.field1137) {
            this.field1156 = new String[]{null, null, null, null, null, null};
         } else {
            this.field1156 = new String[]{null, null, null, null, null, class499.field7610.method3875(this.field1150, 86)};
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field1158[4] + (arg0 != null ? field1158[3] : field1158[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1158[3] : field1158[2]) + ',' + (arg4 != null ? field1158[3] : field1158[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method794(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method795(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 98;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 80;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
