import jaggl.OpenGL;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class614 extends class242 {
   @OriginalMember(
      owner = "client!ot",
      name = "v",
      descriptor = "Lbba;"
   )
   private class124 field8910;
   @OriginalMember(
      owner = "client!ot",
      name = "C",
      descriptor = "Lqu;"
   )
   private class105 field8908;
   @OriginalMember(
      owner = "client!ot",
      name = "x",
      descriptor = "Lwj;"
   )
   private class412 field8914;
   @OriginalMember(
      owner = "client!ot",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8922 = new String[]{method4511(method4510("V;}2d")), method4511(method4510("Ba}S1")), method4511(method4510("W:?\u0011")), method4511(method4510("V;}4d")), method4511(method4510("V;}?d")), method4511(method4510("V;}0d")), method4511(method4510("V;}3d")), method4511(method4510("V;}<d")), method4511(method4510("V;}:d")), method4511(method4510("M=2\u0013?I.!\u0018\"M\u0010$\u001c8\\=")), method4511(method4510("^#")), method4511(method4510("V;}A%W&'Cd")), method4511(method4510("V;}9d")), method4511(method4510("V;}5d"))};
   @OriginalMember(
      owner = "client!ot",
      name = "z",
      descriptor = "Luw;"
   )
   public static class435 field8913 = new class435(17, 3);
   @OriginalMember(
      owner = "client!ot",
      name = "n",
      descriptor = "Ljava/lang/String;"
   )
   public static String field8919;
   @OriginalMember(
      owner = "client!ot",
      name = "t",
      descriptor = "Ljava/lang/String;"
   )
   public static String field8918;
   @OriginalMember(
      owner = "client!ot",
      name = "y",
      descriptor = "I"
   )
   public static int field8907;
   @OriginalMember(
      owner = "client!ot",
      name = "o",
      descriptor = "I"
   )
   public static int field8909;
   @OriginalMember(
      owner = "client!ot",
      name = "p",
      descriptor = "I"
   )
   public static int field8911;
   @OriginalMember(
      owner = "client!ot",
      name = "A",
      descriptor = "I"
   )
   public static int field8912;
   @OriginalMember(
      owner = "client!ot",
      name = "u",
      descriptor = "I"
   )
   public static int field8915;
   @OriginalMember(
      owner = "client!ot",
      name = "q",
      descriptor = "I"
   )
   public static int field8916;
   @OriginalMember(
      owner = "client!ot",
      name = "w",
      descriptor = "I"
   )
   public static int field8917;
   @OriginalMember(
      owner = "client!ot",
      name = "s",
      descriptor = "I"
   )
   public static int field8920;
   @OriginalMember(
      owner = "client!ot",
      name = "r",
      descriptor = "I"
   )
   public static int field8921;

   static {
      String var0 = method4511(method4510("l!8\u0013#N!"));

      try {
         var0 = System.getProperty(method4511(method4510("S.%\u001cbO*=\u0019#K"))).toLowerCase();
      } catch (Exception var11) {
      }

      var0.toLowerCase();
      String var1 = method4511(method4510("l!8\u0013#N!"));

      try {
         var1 = System.getProperty(method4511(method4510("S.%\u001cbO*!\u000e%V!"))).toLowerCase();
      } catch (Exception var10) {
      }

      var1.toLowerCase();
      String var2 = method4511(method4510("l!8\u0013#N!"));

      try {
         var2 = System.getProperty(method4511(method4510("V<}\u0013-T*"))).toLowerCase();
      } catch (Exception var9) {
      }

      field8919 = var2.toLowerCase();
      String var3 = method4511(method4510("l!8\u0013#N!"));

      try {
         var3 = System.getProperty(method4511(method4510("V<}\u001c>Z'"))).toLowerCase();
      } catch (Exception var8) {
      }

      field8918 = var3.toLowerCase();
      String var4 = method4511(method4510("l!8\u0013#N!"));

      try {
         var4 = System.getProperty(method4511(method4510("V<}\u000b)K<:\u0012\""))).toLowerCase();
      } catch (Exception var7) {
      }

      var4.toLowerCase();
      String var5 = method4511(method4510("G`"));

      try {
         var5 = System.getProperty(method4511(method4510("L<6\u000fbQ >\u0018"))).toLowerCase();
      } catch (Exception var6) {
      }

      new File(var5);
   }

   @OriginalMember(
      owner = "client!ot",
      name = "a",
      descriptor = "(ZZ)V",
      line = 4
   )
   public final void method70(boolean arg0, boolean arg1) {
      try {
         ++field8915;
         super.field3498.method2761(class641.field9348, (byte)-69, class345.field4912);
         if (!arg0) {
            this.method65(70, -111, (byte)-41);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8922[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "h",
      descriptor = "(I)I",
      line = 17
   )
   public static final int method4507(int arg0) {
      try {
         ++field8912;
         if (arg0 > -36) {
            field8919 = null;
         }

         return ~class402.field5939 == -2 ? class31.field473 : class634.field9251;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8922[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "a",
      descriptor = "(IILbt;)V",
      line = 34
   )
   public final void method73(int arg0, int arg1, class47 arg2) {
      try {
         if (arg1 <= 12) {
            this.method70(false, true);
         }

         ++field8907;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field8922[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8922[1] : field8922[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "g",
      descriptor = "(I)I",
      line = 47
   )
   public static final int method4508(int arg0) {
      try {
         ++field8917;
         if (class621.field9057 == null) {
            return 0;
         } else {
            int var1 = -57 / ((arg0 - 66) / 41);
            return class621.field9057.length * 2;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8922[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "a",
      descriptor = "(IIB)V",
      line = 61
   )
   public final void method65(int arg0, int arg1, byte arg2) {
      try {
         label19: {
            if (this.field8908.field1744) {
               float var4 = (float)(super.field3498.field5227 % 4000) / 4000.0F;
               super.field3498.method2806(false, this.field8908.field1749);
               OpenGL.glProgramLocalParameter4fARB(34336, 0, var4, 0.0F, 0.0F, 1.0F);
               if (!client.field4564) {
                  break label19;
               }
            }

            int var5 = super.field3498.field5227 % 4000 * 16 / 4000;
            super.field3498.method2806(false, this.field8908.field1746[var5]);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
         }

         if (arg2 > -64) {
            field8918 = null;
         }

         ++field8909;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field8922[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "d",
      descriptor = "(B)V",
      line = 86
   )
   public static void method4509(byte arg0) {
      try {
         field8913 = null;
         if (arg0 != 38) {
            field8921 = 8;
         }

         field8918 = null;
         field8919 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8922[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "<init>",
      descriptor = "(Lbba;Lhw;Lqu;)V",
      line = 99
   )
   public class614(class124 arg0, class141 arg1, class105 arg2) {
      super(arg0);

      try {
         this.field8910 = arg0;
         this.field8908 = arg2;
         if (arg1 != null && this.field8908.method1022(4) && this.field8910.field2088) {
            this.field8914 = class600.method4433(this.field8910, arg1.method1348(field8922[10], field8922[9], 122), 34336, 24048);
         } else {
            this.field8914 = null;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field8922[11] + (arg0 != null ? field8922[1] : field8922[2]) + ',' + (arg1 != null ? field8922[1] : field8922[2]) + ',' + (arg2 != null ? field8922[1] : field8922[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "e",
      descriptor = "(I)Z",
      line = 115
   )
   public final boolean method69(int arg0) {
      try {
         if (arg0 != 30453) {
            return true;
         } else {
            ++field8916;
            return this.field8914 != null;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8922[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "f",
      descriptor = "(I)V",
      line = 128
   )
   public final void method68(int arg0) {
      try {
         ++field8920;
         super.field3498.method2779(8, 0, class540.field7850);
         OpenGL.glBindProgramARB(34336, 0);
         OpenGL.glDisable(34820);
         OpenGL.glDisable(34336);
         int var2 = -17 / ((27 - arg0) / 34);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8922[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "a",
      descriptor = "(ZI)V",
      line = 145
   )
   public final void method72(boolean arg0, int arg1) {
      try {
         ++field8911;
         OpenGL.glBindProgramARB(34336, this.field8914.field6034);
         OpenGL.glEnable(34336);
         if (arg1 != -29461) {
            this.method70(true, true);
         }

         super.field3498.method2779(8, 0, class315.field4537);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8922[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4510(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ot",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4511(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 57;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 83;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
