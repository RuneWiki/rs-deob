import jaclib.hardware_info.HardwareInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class90 extends class428 {
   @OriginalMember(
      owner = "client!gv",
      name = "K",
      descriptor = "I"
   )
   private int field1176;
   @OriginalMember(
      owner = "client!gv",
      name = "B",
      descriptor = "Z"
   )
   private boolean field1163;
   @OriginalMember(
      owner = "client!gv",
      name = "A",
      descriptor = "I"
   )
   private int field1172;
   @OriginalMember(
      owner = "client!gv",
      name = "v",
      descriptor = "I"
   )
   private int field1164;
   @OriginalMember(
      owner = "client!gv",
      name = "o",
      descriptor = "I"
   )
   public int field1183;
   @OriginalMember(
      owner = "client!gv",
      name = "u",
      descriptor = "I"
   )
   private int field1178;
   @OriginalMember(
      owner = "client!gv",
      name = "L",
      descriptor = "Z"
   )
   private boolean field1177;
   @OriginalMember(
      owner = "client!gv",
      name = "D",
      descriptor = "I"
   )
   private int field1184;
   @OriginalMember(
      owner = "client!gv",
      name = "C",
      descriptor = "I"
   )
   public int field1182;
   @OriginalMember(
      owner = "client!gv",
      name = "p",
      descriptor = "I"
   )
   private int field1165;
   @OriginalMember(
      owner = "client!gv",
      name = "m",
      descriptor = "I"
   )
   private int field1180;
   @OriginalMember(
      owner = "client!gv",
      name = "J",
      descriptor = "I"
   )
   public int field1162;
   @OriginalMember(
      owner = "client!gv",
      name = "s",
      descriptor = "I"
   )
   private int field1185;
   @OriginalMember(
      owner = "client!gv",
      name = "n",
      descriptor = "I"
   )
   private int field1166;
   @OriginalMember(
      owner = "client!gv",
      name = "w",
      descriptor = "I"
   )
   private int field1181;
   @OriginalMember(
      owner = "client!gv",
      name = "r",
      descriptor = "Ljava/lang/String;"
   )
   private String field1167;
   @OriginalMember(
      owner = "client!gv",
      name = "y",
      descriptor = "Ljava/lang/String;"
   )
   private String field1186;
   @OriginalMember(
      owner = "client!gv",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private String field1175;
   @OriginalMember(
      owner = "client!gv",
      name = "H",
      descriptor = "Ljava/lang/String;"
   )
   private String field1170;
   @OriginalMember(
      owner = "client!gv",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1187 = new String[]{method792(method791("~#V")), method792(method791("+`\u0002M!")), method792(method791("=d\b")), method792(method791("+}\u0016\u0017p")), method792(method791("\u007f#V")), method792(method791("'d\u0005\tz9b\u0000\u000f")), method792(method791("\u007f#W")), method792(method791("|#V")), method792(method791("9x\b")), method792(method791("25P$#~")), method792(method791("1#HUh")), method792(method791("&d\b\u000em")), method792(method791("{=HM")), method792(method791("'l\u0005")), method792(method791("{=HN")), method792(method791("~#W")), method792(method791("$x\n\u0017")), method792(method791("-{HG|$d\u0012E=")), method792(method791("|#W")), method792(method791("{=HO")), method792(method791("~#_")), method792(method791("-{H8=")), method792(method791("-{H:=")), method792(method791("-{H?=")), method792(method791("-{H9="))};
   @OriginalMember(
      owner = "client!gv",
      name = "F",
      descriptor = "Leg;"
   )
   public static class118 field1174 = new class118(71, 3);
   @OriginalMember(
      owner = "client!gv",
      name = "E",
      descriptor = "I"
   )
   public static int field1168;
   @OriginalMember(
      owner = "client!gv",
      name = "t",
      descriptor = "I"
   )
   public static int field1169;
   @OriginalMember(
      owner = "client!gv",
      name = "x",
      descriptor = "I"
   )
   private int field1171;
   @OriginalMember(
      owner = "client!gv",
      name = "I",
      descriptor = "I"
   )
   private int field1173;
   @OriginalMember(
      owner = "client!gv",
      name = "q",
      descriptor = "I"
   )
   public static int field1179;

   @OriginalMember(
      owner = "client!gv",
      name = "b",
      descriptor = "(I)V"
   )
   private final void method787(int arg0) {
      try {
         if (~this.field1186.length() < -41) {
            this.field1186 = this.field1186.substring(0, 40);
         }

         ++field1168;
         if (~this.field1167.length() < -41) {
            this.field1167 = this.field1167.substring(0, 40);
         }

         if (this.field1170.length() > arg0) {
            this.field1170 = this.field1170.substring(0, 10);
         }

         if (~this.field1175.length() < -11) {
            this.field1175 = this.field1175.substring(0, 10);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1187[24] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gv",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method788(int arg0) {
      try {
         field1174 = null;
         if (arg0 != 2) {
            field1174 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1187[21] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gv",
      name = "a",
      descriptor = "(Lwf;B)V"
   )
   public final void method789(class147 arg0, byte arg1) {
      try {
         arg0.method1186(5, 0);
         ++field1169;
         if (arg1 < -48) {
            arg0.method1186(this.field1176, 0);
            arg0.method1186(!this.field1163 ? 0 : 1, 0);
            arg0.method1186(this.field1172, 0);
            arg0.method1186(this.field1164, 0);
            arg0.method1186(this.field1183, 0);
            arg0.method1186(this.field1178, 0);
            arg0.method1186(this.field1182, 0);
            arg0.method1186(!this.field1177 ? 0 : 1, 0);
            arg0.method1185(this.field1184, true);
            arg0.method1186(this.field1165, 0);
            arg0.method1178((byte)-125, this.field1162);
            arg0.method1185(this.field1166, true);
            arg0.method1186(this.field1181, 0);
            arg0.method1186(this.field1180, 0);
            arg0.method1186(this.field1185, 0);
            arg0.method1157(255, this.field1186);
            arg0.method1157(255, this.field1167);
            arg0.method1157(255, this.field1170);
            arg0.method1157(255, this.field1175);
            arg0.method1186(this.field1171, 0);
            arg0.method1185(this.field1173, true);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1187[23] + (arg0 != null ? field1187[10] : field1187[16]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gv",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method790(byte arg0) {
      try {
         ++field1179;
         byte var2 = 23;
         int var3 = var2 + class591.method4296(this.field1186, 8);
         int var4 = var3 + class591.method4296(this.field1167, 8);
         int var5 = var4 + class591.method4296(this.field1170, 8);
         int var6 = var5 + class591.method4296(this.field1175, 8);
         if (arg0 < 60) {
            this.field1167 = null;
         }

         return var6;
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field1187[22] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gv",
      name = "<init>",
      descriptor = "()V"
   )
   public class90() {
   }

   @OriginalMember(
      owner = "client!gv",
      name = "<init>",
      descriptor = "(ZLnu;)V"
   )
   public class90(boolean arg0, class619 arg1) {
      boolean var3 = client.field4360;
      super();

      try {
         if (arg0) {
            label292: {
               if (!class619.field9120.startsWith(field1187[2])) {
                  if (!class619.field9120.startsWith(field1187[13])) {
                     if (!class619.field9120.startsWith(field1187[11])) {
                        this.field1176 = 4;
                        if (!var3) {
                           break label292;
                        }
                     }

                     this.field1176 = 3;
                     if (!var3) {
                        break label292;
                     }
                  }

                  this.field1176 = 2;
                  if (!var3) {
                     break label292;
                  }
               }

               this.field1176 = 1;
            }

            label310: {
               if (class619.field9129.startsWith(field1187[1]) || class619.field9129.startsWith(field1187[9])) {
                  this.field1163 = true;
                  if (!var3) {
                     break label310;
                  }
               }

               this.field1163 = false;
            }

            label300: {
               if (~this.field1176 != -2) {
                  if (~this.field1176 != -3) {
                     break label300;
                  }

                  if (~class619.field9121.indexOf(field1187[19]) != 0) {
                     this.field1172 = 20;
                     if (!var3) {
                        break label300;
                     }
                  }

                  if (class619.field9121.indexOf(field1187[14]) == -1) {
                     if (~class619.field9121.indexOf(field1187[12]) == 0) {
                        break label300;
                     }

                     this.field1172 = 22;
                     if (!var3) {
                        break label300;
                     }
                  }

                  this.field1172 = 21;
                  if (!var3) {
                     break label300;
                  }
               }

               if (class619.field9121.indexOf(field1187[0]) != -1) {
                  this.field1172 = 1;
                  if (!var3) {
                     break label300;
                  }
               }

               if (class619.field9121.indexOf(field1187[15]) != -1) {
                  this.field1172 = 2;
                  if (!var3) {
                     break label300;
                  }
               }

               if (~class619.field9121.indexOf(field1187[20]) == 0) {
                  if (~class619.field9121.indexOf(field1187[4]) == 0) {
                     if (class619.field9121.indexOf(field1187[6]) != -1) {
                        this.field1172 = 5;
                        if (!var3) {
                           break label300;
                        }
                     }

                     if (class619.field9121.indexOf(field1187[7]) != -1) {
                        this.field1172 = 6;
                        if (!var3) {
                           break label300;
                        }
                     }

                     if (class619.field9121.indexOf(field1187[18]) == -1) {
                        break label300;
                     }

                     this.field1172 = 7;
                     if (!var3) {
                        break label300;
                     }
                  }

                  this.field1172 = 4;
                  if (!var3) {
                     break label300;
                  }
               }

               this.field1172 = 3;
            }

            label238: {
               if (~class619.field9136.toLowerCase().indexOf(field1187[8]) == 0) {
                  if (~class619.field9136.toLowerCase().indexOf(field1187[5]) != 0) {
                     this.field1164 = 2;
                     if (!var3) {
                        break label238;
                     }
                  }

                  if (~class619.field9136.toLowerCase().indexOf(field1187[3]) != 0) {
                     this.field1164 = 3;
                     if (!var3) {
                        break label238;
                     }
                  }

                  this.field1164 = 4;
                  if (!var3) {
                     break label238;
                  }
               }

               this.field1164 = 1;
            }

            int var4 = 2;
            int var5 = 0;

            label226: {
               label225: {
                  try {
                     if (var3 || var4 < class619.field9133.length()) {
                        do {
                           char var6 = class619.field9133.charAt(var4);
                           if (var6 < '0' || ~var6 < -58) {
                              break label225;
                           }

                           var5 = var5 * 10 + var6 - 48;
                           ++var4;
                        } while(var4 < class619.field9133.length());
                     }
                  } catch (Exception var14) {
                     break label225;
                  }

                  if (var3) {
                     break label226;
                  }
               }

               this.field1183 = var5;
               var5 = 0;
               var4 = 1 + class619.field9133.indexOf(46, 2);
            }

            label206: {
               label205: {
                  try {
                     if (var3 || class619.field9133.length() > var4) {
                        do {
                           char var7 = class619.field9133.charAt(var4);
                           if (~var7 > -49 || ~var7 < -58) {
                              break label205;
                           }

                           ++var4;
                           var5 = var5 * 10 + var7 + -48;
                        } while(class619.field9133.length() > var4);
                     }
                  } catch (Exception var13) {
                     break label205;
                  }

                  if (var3) {
                     break label206;
                  }
               }

               this.field1178 = var5;
               var5 = 0;
               var4 = 1 + class619.field9133.indexOf(95, 4);
            }

            label186: {
               try {
                  if (var3 || ~class619.field9133.length() < ~var4) {
                     do {
                        char var8 = class619.field9133.charAt(var4);
                        if (var8 < '0' || ~var8 < -58 && !var3) {
                           break label186;
                        }

                        var5 = var5 * 10 + var8 + -48;
                        ++var4;
                     } while(~class619.field9133.length() < ~var4);
                  }
               } catch (Exception var12) {
                  break label186;
               }

               if (!var3) {
               }
            }

            label168: {
               if (!arg1.field9134) {
                  this.field1177 = true;
                  if (!var3) {
                     break label168;
                  }
               }

               this.field1177 = false;
            }

            label163: {
               this.field1184 = class409.field5915;
               this.field1182 = var5;
               if (~this.field1183 < -4) {
                  this.field1165 = class683.field10050;
                  if (!var3) {
                     break label163;
                  }
               }

               this.field1165 = 0;
            }

            try {
               int[] var9 = HardwareInfo.getCPUInfo();
               if (var9 != null && ~var9.length == -8) {
                  this.field1180 = var9[4];
                  this.field1162 = var9[6];
                  this.field1185 = var9[5];
                  this.field1166 = var9[2];
                  this.field1181 = var9[3];
               }
            } catch (Throwable var11) {
               this.field1162 = 0;
            }
         }

         if (this.field1167 == null) {
            this.field1167 = "";
         }

         if (this.field1186 == null) {
            this.field1186 = "";
         }

         if (this.field1175 == null) {
            this.field1175 = "";
         }

         if (this.field1170 == null) {
            this.field1170 = "";
         }

         this.method787(10);
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field1187[17] + arg0 + ',' + (arg1 != null ? field1187[10] : field1187[16]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method791(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method792(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 74;
            break;
         case 1:
            var10005 = 13;
            break;
         case 2:
            var10005 = 102;
            break;
         case 3:
            var10005 = 123;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
