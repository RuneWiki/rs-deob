import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class499 extends class557 {
   @OriginalMember(
      owner = "client!hv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7110 = new String[]{method3783(method3782("8n7wk")), method3783(method3782("+67\u0010>")), method3783(method3782("-5u5")), method3783(method3782("+67\u001d>")), method3783(method3782("+67\u0013>")), method3783(method3782("+67\u001b>")), method3783(method3782("+67\u0018>")), method3783(method3782("+67\u001a>")), method3783(method3782("\u000b)}=s-ml*s")), method3783(method3782("+67\u0012>")), method3783(method3782("+67\u001f>")), method3783(method3782("+67\u001c>")), method3783(method3782("+67\u0011>")), method3783(method3782("+67\u001e>"))};
   @OriginalMember(
      owner = "client!hv",
      name = "u",
      descriptor = "Lhha;"
   )
   public static class724 field7096 = new class724(28, 0);
   @OriginalMember(
      owner = "client!hv",
      name = "p",
      descriptor = "I"
   )
   public static int field7108 = 0;
   @OriginalMember(
      owner = "client!hv",
      name = "j",
      descriptor = "Lhha;"
   )
   public static class724 field7109 = new class724(74, 20);
   @OriginalMember(
      owner = "client!hv",
      name = "i",
      descriptor = "I"
   )
   public static int field7095;
   @OriginalMember(
      owner = "client!hv",
      name = "n",
      descriptor = "I"
   )
   public static int field7097;
   @OriginalMember(
      owner = "client!hv",
      name = "k",
      descriptor = "I"
   )
   public static int field7098;
   @OriginalMember(
      owner = "client!hv",
      name = "m",
      descriptor = "I"
   )
   public static int field7099;
   @OriginalMember(
      owner = "client!hv",
      name = "t",
      descriptor = "I"
   )
   public static int field7101;
   @OriginalMember(
      owner = "client!hv",
      name = "r",
      descriptor = "I"
   )
   public static int field7102;
   @OriginalMember(
      owner = "client!hv",
      name = "q",
      descriptor = "I"
   )
   public static int field7103;
   @OriginalMember(
      owner = "client!hv",
      name = "l",
      descriptor = "I"
   )
   public static int field7104;
   @OriginalMember(
      owner = "client!hv",
      name = "o",
      descriptor = "I"
   )
   public static int field7105;
   @OriginalMember(
      owner = "client!hv",
      name = "s",
      descriptor = "I"
   )
   public static int field7106;
   @OriginalMember(
      owner = "client!hv",
      name = "h",
      descriptor = "I"
   )
   public static int field7107;
   @OriginalMember(
      owner = "client!hv",
      name = "v",
      descriptor = "Lsa;"
   )
   public static class39 field7100;

   @OriginalMember(
      owner = "client!hv",
      name = "e",
      descriptor = "(I)I"
   )
   public final int method3775(int arg0) {
      try {
         ++field7099;
         if (arg0 > -52) {
            field7109 = null;
         }

         return super.field7905;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7110[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "<init>",
      descriptor = "(Loea;)V"
   )
   public class499(class647 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!hv",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method92(int arg0, int arg1) {
      try {
         if (arg0 != 1) {
            field7109 = null;
         }

         ++field7106;
         return 1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7110[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method3776(int arg0) {
      try {
         ++field7103;
         if (class37.field543) {
            class91 var1 = class751.method5399(class224.field3183, 1, class704.field10135);
            if (var1 != null && var1.field1454 != null) {
               class536 var2 = new class536();
               var2.field7529 = var1.field1454;
               var2.field7524 = var1;
               class427.method3337(var2);
            }

            class357.field5276 = -1;
            class451.field6582 = -1;
            class37.field543 = false;
            if (var1 != null) {
               class566.method4205(1727005542, var1);
            }

            int var3 = 35 / ((69 - arg0) / 47);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field7110[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "a",
      descriptor = "(Ljga;I)Ljava/lang/String;"
   )
   public static final String method3777(class91 arg0, int arg1) {
      try {
         ++field7102;
         if (client.method5048(arg0).method3238(-116) == 0) {
            return null;
         } else if (arg0.field1443 != null && ~arg0.field1443.trim().length() != -1) {
            return arg1 != 28 ? null : arg0.field1443;
         } else {
            return class34.field514 ? field7110[8] : null;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7110[9] + (arg0 != null ? field7110[0] : field7110[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "a",
      descriptor = "([FBI)[F"
   )
   public static final float[] method3778(float[] arg0, byte arg1, int arg2) {
      try {
         ++field7107;
         float[] var3 = new float[arg2];
         if (arg1 != -50) {
            field7097 = -61;
         }

         class474.method3639(arg0, 0, var3, 0, arg2);
         return var3;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field7110[12] + (arg0 != null ? field7110[0] : field7110[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "<init>",
      descriptor = "(ILoea;)V"
   )
   public class499(int arg0, class647 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!hv",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method99(int arg0, boolean arg1) {
      try {
         super.field7905 = arg0;
         if (!arg1) {
            this.method99(-72, false);
         }

         ++field7101;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7110[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "a",
      descriptor = "(IILsa;JIZII)V"
   )
   public static final void method3779(int arg0, int arg1, class39 arg2, long arg3, int arg4, boolean arg5, int arg6, int arg7) {
      try {
         class487.field6949 = 1;
         class10.field165 = 10000;
         class94.field1537 = arg6;
         class563.field8019 = arg2;
         class705.field10146 = arg5;
         if (arg1 != 19608) {
            field7108 = 17;
         }

         class778.field11344 = null;
         class388.field5657 = arg3;
         class790.field11504 = arg4;
         ++field7105;
         class681.field9845 = arg7;
         class438.field6424 = arg0;
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field7110[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7110[0] : field7110[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method97(int arg0) {
      try {
         if (arg0 != 0) {
            field7096 = null;
         }

         ++field7095;
         return 127;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7110[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method3780(byte arg0) {
      try {
         field7100 = null;
         field7109 = null;
         int var1 = -68 / ((arg0 - 3) / 61);
         field7096 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7110[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method3781(int arg0) {
      try {
         class153.field2340 = null;
         ++field7104;
         class356.field5273 = null;
         class762.field10867 = null;
         if (arg0 <= 100) {
            field7100 = null;
         }

         class801.field11658 = false;
         class59.field853 = null;
         class315.field4716 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7110[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method98(byte arg0) {
      try {
         ++field7098;
         if (arg0 != -22) {
            method3780((byte)22);
         }

         if (~super.field7905 > -1 && super.field7905 > 127) {
            super.field7905 = this.method97(arg0 ^ -22);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7110[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3782(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3783(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 67;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 25;
            break;
         case 3:
            var10005 = 89;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
