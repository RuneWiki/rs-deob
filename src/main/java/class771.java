import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iha")
public class class771 extends class416 {
   @OriginalMember(
      owner = "client!iha",
      name = "l",
      descriptor = "Z"
   )
   private boolean field11360 = false;
   @OriginalMember(
      owner = "client!iha",
      name = "q",
      descriptor = "Z"
   )
   private boolean field11355;
   @OriginalMember(
      owner = "client!iha",
      name = "g",
      descriptor = "Lep;"
   )
   private class454 field11346;
   @OriginalMember(
      owner = "client!iha",
      name = "p",
      descriptor = "Lep;"
   )
   private class454 field11358;
   @OriginalMember(
      owner = "client!iha",
      name = "o",
      descriptor = "Lep;"
   )
   private class454 field11352;
   @OriginalMember(
      owner = "client!iha",
      name = "k",
      descriptor = "Lep;"
   )
   private class454 field11357;
   @OriginalMember(
      owner = "client!iha",
      name = "d",
      descriptor = "Lbka;"
   )
   private class396 field11353;
   @OriginalMember(
      owner = "client!iha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11362 = new String[]{method5626(method5625("\u0006U[z\u0000G")), method5626(method5625("\u0006U[z\tG")), method5626(method5625("\u0006U[z\rG")), method5626(method5625("\u0001HV8")), method5626(method5625("\u0014\u0013\u0014z5")), method5626(method5625("N\u001c{\u0006\n\u0019M\u000bzxe|n\u0000\u001a&\u007f\u001at!?RIthO\u001d\u001athO\u001d\u0007t>\nON10AMU'!\u001bTU:se|n\u0000\u001a&\u007f\u001at!,RV;=\u001d\u001d\u001athO\u001d\u0007t>\nON10A^U8'\u001d\u00060\u0015\u001c;os\u0016hOTn10,RU&,O\u001d\u001atuOK_&<\nE\u0014 -\u0017^U;:\u000bf\n\tsero\u0000\u0018:i\u001at'?RIthO\u001d\u001athO\u001d\u0007t:\nNO8<AMU'!\u001bTU:sero\u0000\u0018:i\u001at',RV;=\u001d\u001d\u001athO\u001d\u0007t:\nNO8<A^U8'\u001d\u00060\u001b\u001d;mo\u0000hORn10,RU&,_\u001d\u001atuOO_'=\u0003I\u0014 -\u0017^U;:\u000bf\n\tsero\u0000\u0018:i\u001at';XB\u0017'\u0000O^ehO\u001d\u0007t:\nNO8<AI_,+\u0000RH0\u0013^`\u0001^\u0007:ij\u0001\u001cO\u001dU\u0012'\b~U;:\u000b\u001d\u001athR\u001dH1;\u001aQNz.\u0000ZY;'\u001dY\u0001^\u0018.o{\u0019hO\u001d\\;/?\\H5%\u001c\u001d\u001athR\u001dJ&'\bO[9f\u0003RY5$4\rgoB?|h\u0015\u0005O\u001d\u001a#)\u001bXH\u0004$\u000eS_thO\u0000\u001a$:\u0000ZH5%AQU7)\u0003f\u000b\tsem{\u0006\t\"\u001d\u001at8\"\\N&!\u0017f\u000e\thO\u001d\u0007t3ONN5<\n\u0013W5<\u001dTBz8\u001dRP1+\u001bTU:h\u0012\u00060\u0004\t=|wthOPL\u0019)\u001bOS,\u0013[`\u001atuOF\u001a'<\u000eI_z%\u000eIH=0APU0-\u0003KS1?O@\u0001^\u0018.o{\u0019hO\u001dN10\"\\N&!\u0017f\u000e\thR\u001dAt;\u001b\\N1f\u0002\\N&!\u0017\u0013N10\u001bHH1\u0013_`\u001a)sei\u007f\u0019\u0018O\u001d\u001at>\u0006XM\u0004'\u001c\u0011\u001a2'\b{[7<\u0000O\u0016t,\nMN<seyj`hO\u001dL=-\u0018mU'f\u0017\u0011\u001a9>\"\\N&!\u0017f\n\tdOTj;;T7~\u0004|O\u001d\u001a\"!\nJj;;AD\u0016t%\u0019p[ :\u0006Eae\u0015C\u001dS\u0004'\u001c\u00060\u0010\u0018[\u001d\u001at>\u0006XM\u0004'\u001c\u0013@xh\u0002Kw5<\u001dTB\u000fz2\u0011\u001a=\u0018\u0000N\u0001^\f?\t\u001ath\u0019T_#\u0018\u0000N\u0014#dOPL\u0019)\u001bOS,\u0013\\`\u0016t!?RIoB<hxthO[U3\u000e\u000e^N;:AE\u0016te\u0019T_#\u0018\u0000N\u0014.dO[U3\u0018\u000eO[9;AE\u0001^\u0005:q\u001ath\tR]\u0012)\fIU&f\u0017\u0011\u001a2'\b{[7<\u0000O\u0014,dO\r\u0014dx^\u0004\u000fgy]\b\u0001^\f?\t\u001ath\u000bXJ  C\u001dM5<\nOj8)\u0001X\u0016t>\u0006XM\u0004'\u001c\u00060\u0019\t+\u001d\u001at.\u0000Z|5+\u001bRHz1C\u001d\u00170-\u001fIRxh\tR]\u0004)\u001d\\W'f\u0015\u0011\u001a2'\bm[&)\u0002N\u0014#seno\u0016hO\u001d\\;/)\\Y '\u001d\u0013@xhBKS1??RIz2C\u001d\\;/?\\H5%\u001c\u0013CoB\"hvthO[U3\u000e\u000e^N;:AG\u0016t.\u0000Z|5+\u001bRHz2C\u001d\nzx_\u000e\u0003d~]\b\u0001^\u0005&s\u001ath\tR]\u0012)\fIU&dO[U3\u000e\u000e^N;:C\u001d\u000boB\"|bthO[U3\u000e\u000e^N;:C\u001d\\;/)\\Y '\u001d\u0011\u001adsepo\u0018hO\u001d\\;/)\\Y '\u001d\u0013@xh\tR]\u0012)\fIU&f\u0015\u0011\u001ay,\nMN<sep{\u0010hO\u001dL=-\u0018mU'f\u0017D@xh\u0018\\N1:?Q[:-AEC.?C\u001d\\;/)\\Y '\u001d\u0013@.2\u0015\u0011\u001a\"!\nJj;;AEC.?T7w\u0015\u0010O\u001d\u001a;\u001c\nEy;'\u001dY\u000bz0\u0016G\u0016t.\u0000Z|5+\u001bRHz0\u0017EBxh\tR]\u0012)\fIU&f\u0016DC-sepu\u0002hO\u001dU\u0000-\u0017~U;:\u000b\f\u0014#dO\f\u0001^\u0005 k\u001ath\u0000~U8'\u001aO\u0016t!,RV;=\u001d\u00060\u0010\u0018[\u001d\u001at'?RIz0C\u001dJ\u0019)\u001bOS,\u0013_`\u0016t>\u0006XM\u0004'\u001c\u00060\u0010\u0018[\u001d\u001at'?RIz1C\u001dJ\u0019)\u001bOS,\u0013^`\u0016t>\u0006XM\u0004'\u001c\u00060\u0010\u0018[\u001d\u001at'?RIz2C\u001dJ\u0019)\u001bOS,\u0013]`\u0016t>\u0006XM\u0004'\u001c\u00060\u0010\u0018[\u001d\u001at'?RIz?C\u001dJ\u0019)\u001bOS,\u0013\\`\u0016t>\u0006XM\u0004'\u001c\u00060\u0019\u00079\u001d\u001at')R]\u0017'\u0000O^z0C\u001dL=-\u0018mU'f\u0015\u00060\u0010\u0018[\u001d\u001at';XB\u0017'\u0000O^df\u0017\u0011\u001a -\u0017p[ :\u0006Ead\u0015C\u001dS\u0000-\u0017~U;:\u000b\u00060\u0010\u0018[\u001d\u001at';XB\u0017'\u0000O^df\u0016\u0011\u001a -\u0017p[ :\u0006Eae\u0015C\u001dS\u0000-\u0017~U;:\u000b\u00060\u0010\u0018[\u001d\u001at';XB\u0017'\u0000O^df\u0015\u0011\u001a -\u0017p[ :\u0006Eaf\u0015C\u001dS\u0000-\u0017~U;:\u000b\u00060\u0019\u00079\u001d\u001at';XB\u0017'\u0000O^df\u0018\u0011\u001aesext\u0010B")), method5626(method5625("N\u001c{\u0006\n\u0019M\u000bzxe|n\u0000\u001a&\u007f\u001at!?RIthO\u001d\u001athO\u001d\u0007t>\nON10AMU'!\u001bTU:se|n\u0000\u001a&\u007f\u001at!!RH9)\u0003\u001d\u001athO\u001d\u0007t>\nON10ASU&%\u000eQ\u0001^\t;ih\u001d\nO\u001dS\u0017'\u0003RO&hO\u001d\u001athR\u001dL1:\u001bXBz+\u0000QU&se|n\u0000\u001a&\u007f\u001at!;XB\u0017'\u0000O^thO\u001d\u0007t>\nON10AI_,+\u0000RH0\u0013_`\u0001^\u0007:ij\u0001\u001cO\u001dU\u0004'\u001c\u001d\u001athO\u001d\u001athR\u001dH1;\u001aQNz8\u0000NS !\u0000S\u0001^\u0007:ij\u0001\u001cO\u001dU\u0017'\u0003RO&hO\u001d\u001athR\u001dH1;\u001aQNz+\u0000QU&sero\u0000\u0018:i\u001at';XB\u0017'\u0000O^dhO\u001d\u0007t:\nNO8<AI_,+\u0000RH0\u0013_`\u0001^\u0007:ij\u0001\u001cO\u001dU\u0000-\u0017~U;:\u000b\f\u001athR\u001dH1;\u001aQNz<\nEY;'\u001dYae\u0015T7u\u0001\u001c?hnth\u0000{U3\u000b\u0000RH0hO\u001d\u001aih\u001dXI!$\u001b\u0013\\;/\fRU&,T7j\u0015\u001a.p\u001ath\tR]\u0004)\u001d\\W'hO\u001d\u001aih\u001fOU3:\u000eP\u00148'\f\\V\u000fx2\u00060\u0004\t=|wthOJ[ -\u001dmV5&\n\u001d\u001atuOMH;/\u001d\\Wz$\u0000^[8\u0013^`\u0001^\u0018.o{\u0019hO\u001dJ\u0019)\u001bOS,\u0013[`\u001athR\u001dAt;\u001b\\N1f\u0002\\N&!\u0017\u0013J&'\u0005XY !\u0000S\u001a)sem{\u0006\t\"\u001d\u001at%\u0019p[ :\u0006Ea`\u0015O\u001d\u0007t3ONN5<\n\u0013W5<\u001dTBz%\u0000Y_8>\u0006XMt5T7j\u0015\u001a.p\u001ath\u001bXB\u0019)\u001bOS,\u0013[`\u001aih\u0014\u001dI )\u001bX\u00149)\u001bOS,f\u001bXB =\u001dXad\u0015O@\u0001^\u001c*pjthO\u001dL=-\u0018mU'dOKS1?!RH9)\u0003\u0011\u001a2'\b{[7<\u0000O\u0016t,\nMN<dO^U8'\u001aO\u0016t&\u000bRN8seyj`hO\u001dL=-\u0018mU'f\u0017\u0011\u001a9>\"\\N&!\u0017f\n\tdOTj;;T7~\u0004|O\u001d\u001a\"!\nJj;;AD\u0016t%\u0019p[ :\u0006Eae\u0015C\u001dS\u0004'\u001c\u00060\u0010\u0018[\u001d\u001at>\u0006XM\u0004'\u001c\u0013@xh\u0002Kw5<\u001dTB\u000fz2\u0011\u001a=\u0018\u0000N\u0001^\f?\t\u001ath\u0019T_#\u0018\u0000N\u0014#dOPL\u0019)\u001bOS,\u0013\\`\u0016t!?RIoB<hxthO[U3\u000e\u000e^N;:AE\u0016te\u0019T_#\u0018\u0000N\u0014.dO[U3\u0018\u000eO[9;AE\u0001^\u0005:q\u001ath\tR]\u0012)\fIU&f\u0017\u0011\u001a2'\b{[7<\u0000O\u0014,dO\r\u0014dx^\u0004\u000fgy]\b\u0001^\f?\t\u001ath\u000bXJ  C\u001dM5<\nOj8)\u0001X\u0016t>\u0006XM\u0004'\u001c\u00060\u0019\t+\u001d\u001at.\u0000Z|5+\u001bRHz1C\u001d\u00170-\u001fIRxh\tR]\u0004)\u001d\\W'f\u0015\u0011\u001a2'\bm[&)\u0002N\u0014#seno\u0016hO\u001d\\;/)\\Y '\u001d\u0013@xhBKS1??RIz2C\u001d\\;/?\\H5%\u001c\u0013CoB\"hvthO[U3\u000e\u000e^N;:AG\u0016t.\u0000Z|5+\u001bRHz2C\u001d\nzx_\u000e\u0003d~]\b\u0001^\u0005&s\u001ath\tR]\u0012)\fIU&dO[U3\u000e\u000e^N;:C\u001d\u000boB\"|bthO[U3\u000e\u000e^N;:C\u001d\\;/)\\Y '\u001d\u0011\u001adsepo\u0018hO\u001d\\;/)\\Y '\u001d\u0013@xh\tR]\u0012)\fIU&f\u0015\u0011\u001ay,\nMN<sep{\u0010hO\u001dL=-\u0018mU'f\u0017D@xh\u0018\\N1:?Q[:-AEC.?C\u001d\\;/)\\Y '\u001d\u0013@.2\u0015\u0011\u001a\"!\nJj;;AEC.?T7w\u0015\u0010O\u001d\u001a;\u001c\nEy;'\u001dY\u000bz0\u0016G\u0016t.\u0000Z|5+\u001bRHz0\u0017EBxh\tR]\u0012)\fIU&f\u0016DC-sepu\u0002hO\u001dU\u0000-\u0017~U;:\u000b\f\u0014#dO\f\u0001^\f?\u000e\u001ath\u0019T_#\u0006\u0000OW5$AE\u0016t%\u0019p[ :\u0006Ead\u0015C\u001dS\u001a'\u001dP[8seyjghO\u001dL=-\u0018sU&%\u000eQ\u0014-dOPL\u0019)\u001bOS,\u0013^`\u0016t!!RH9)\u0003\u00060\u0010\u0018\\\u001d\u001at>\u0006XM\u001a'\u001dP[8f\u0015\u0011\u001a9>\"\\N&!\u0017f\b\tdOTt;:\u0002\\VoB+m\tthOS^;<\u0003\u0013Bxh\u0019T_#\u0006\u0000OW5$C\u001dI )\u001bX\u00148!\bUN\u000fx2\u0013J;;\u0006IS;&T7~\u0004{O\u001d\u001a:,\u0000IVz1C\u001dL=-\u0018sU&%\u000eQ\u0016t;\u001b\\N1f\u0003T]<<4\fgz8\u0000NS !\u0000S\u0001^\u0005.e\u001ath\u0001YU $C\u001dT0'\u001bQ\u0016txT7w\u001b\u001eO\u001d\u001a7'\u0003RO&dONN5<\n\u0013V=/\u0007IW;,\nQ\u00145%\rT_:<T7w\u0015\fO\u001d\u001a7'\u0003RO&dONN5<\n\u0013V=/\u0007Iad\u0015AYS2.\u001aN_xh\u0001YU $AEB,0C\u001dY;$\u0000HHoB\"|~thO^U8'\u001aO\u0016t;\u001b\\N1f\u0003T]<<4\fgz,\u0006[\\!;\n\u0011\u001a:,\u0000IVz1\u0016DCxh\fRV;=\u001d\u00060\u0019\u001d#\u001d\u001at',RV;=\u001d\u0011\u001a=\u000b\u0000QU!:C\u001dY;$\u0000HHoB+m\u000ethORj;;AE\u0016t8\"\\N&!\u0017f\n\tdOKS1??RIoB+m\u000ethORj;;AD\u0016t8\"\\N&!\u0017f\u000b\tdOKS1??RIoB+m\u000ethORj;;AG\u0016t8\"\\N&!\u0017f\b\tdOKS1??RIoB+m\u000ethORj;;AJ\u0016t8\"\\N&!\u0017f\t\tdOKS1??RIoB\"rlthOR|;/,RU&,AE\u0016t>\u0006XM\u0004'\u001c\u0013@oB+m\u000ethORn10,RU&,_\u0013Bxh\u001bXB\u0019)\u001bOS,\u0013_`\u0016t!;XB\u0017'\u0000O^oB+m\u000ethORn10,RU&,_\u0013Cxh\u001bXB\u0019)\u001bOS,\u0013^`\u0016t!;XB\u0017'\u0000O^oB+m\u000ethORn10,RU&,_\u0013@xh\u001bXB\u0019)\u001bOS,\u0013]`\u0016t!;XB\u0017'\u0000O^oB\"rlthORn10,RU&,_\u0013Mxh^\u00060\u0011\u0006+7")), method5626(method5625("N\u001c{\u0006\n\u0019M\u000bzxe|n\u0000\u001a&\u007f\u001at!?RIthO\u001d\u001athO\u001d\u0007t>\nON10AMU'!\u001bTU:se|n\u0000\u001a&\u007f\u001at!!RH9)\u0003\u001d\u001athO\u001d\u0007t>\nON10ASU&%\u000eQ\u0001^\t;ih\u001d\nO\u001dS\u0017'\u0003RO&hO\u001d\u001athR\u001dL1:\u001bXBz+\u0000QU&se|n\u0000\u001a&\u007f\u001at!;XB\u0017'\u0000O^thO\u001d\u0007t>\nON10AI_,+\u0000RH0\u0013_`\u0001^\u0007:ij\u0001\u001cO\u001dU\u0004'\u001c\u001d\u001athO\u001d\u001athR\u001dH1;\u001aQNz8\u0000NS !\u0000S\u0001^\u0007:ij\u0001\u001cO\u001dU\u0017'\u0003RO&hO\u001d\u001athR\u001dH1;\u001aQNz+\u0000QU&sero\u0000\u0018:i\u001at';XB\u0017'\u0000O^dhO\u001d\u0007t:\nNO8<AI_,+\u0000RH0\u0013_`\u0001^\u0007:ij\u0001\u001cO\u001dU\u0000-\u0017~U;:\u000b\f\u001athR\u001dH1;\u001aQNz<\nEY;'\u001dYae\u0015T7u\u0001\u001c?hnth\u0000{U3\u000b\u0000RH0hO\u001d\u001aih\u001dXI!$\u001b\u0013\\;/\fRU&,T7j\u0015\u001a.p\u001ath\tR]\u0004)\u001d\\W'hO\u001d\u001aih\u001fOU3:\u000eP\u00148'\f\\V\u000fx2\u00060\u0004\t=|wthOJ[ -\u001dmV5&\n\u001d\u001atuOMH;/\u001d\\Wz$\u0000^[8\u0013^`\u0001^\u0018.o{\u0019hO\u001dN\u0019)\u001bOS,\u0013[`\u001athR\u001dAt;\u001b\\N1f\u0002\\N&!\u0017\u0013N10\u001bHH1\u0013_`\u001a)sem{\u0006\t\"\u001d\u001at8\"\\N&!\u0017f\u000e\thO\u001d\u0007t3ONN5<\n\u0013W5<\u001dTBz8\u001dRP1+\u001bTU:h\u0012\u00060\u0004\t=|wthOPL\u0019)\u001bOS,\u0013[`\u001atuOF\u001a'<\u000eI_z%\u000eIH=0APU0-\u0003KS1?O@\u0001^\u001c*pjthO\u001dL=-\u0018mU'dOKS1?!RH9)\u0003\u0011\u001a2'\b{[7<\u0000O\u0016t+\u0000QU!:C\u001dT0'\u001bQ\u0001^\f?\t\u001ath\u0019T_#\u0018\u0000N\u0014,dOPL\u0019)\u001bOS,\u0013_`\u0016t!?RIoB+m\u000ethOKS1??RIz1C\u001dW\"\u0005\u000eIH=04\fgxh\u0006mU'seyj`hO\u001dL=-\u0018mU'f\u0015\u0011\u001a9>\"\\N&!\u0017f\b\tdOTj;;T7~\u0004|O\u001d\u001a\"!\nJj;;AJ\u0016t%\u0019p[ :\u0006Eag\u0015C\u001dS\u0004'\u001c\u00060\u0007\u001d-\u001d\u001at.\u0000Z|5+\u001bRHz0C\u001d\u0017\"!\nJj;;AG\u0016t.\u0000Zj5:\u000ePIz0T7w\u0001\u0004O\u001d\u001a2'\b{[7<\u0000O\u0014,dO[U3\u000e\u000e^N;:AE\u0016txA\r\neqZ\u000e\u000bf}T7w\u0015\fO\u001d\u001a2'\b{[7<\u0000O\u0014-dOTn10,RU&,AG\u0016t.\u0000Zj5:\u000ePIz2C\u001d\\;/?\\H5%\u001c\u0013MoB<hxthO[U3\u000e\u000e^N;:AG\u0016te\u0019T_#\u0018\u0000N\u0014.dO[U3\u0018\u000eO[9;AD\u0001^\u0005:q\u001ath\tR]\u0012)\fIU&f\u0015\u0011\u001a2'\b{[7<\u0000O\u0014.dO\r\u0014dx\\\u0004\nbzZ\u00060\u0019\u001d#\u001d\u001at.\u0000Z|5+\u001bRHz0C\u001d\\;/)\\Y '\u001d\u0013Bxh\tR]\u0012)\fIU&f\u0016\u00060\u0019\u0001!\u001d\u001at.\u0000Z|5+\u001bRHxh\tR]\u0012)\fIU&dO\f\u0001^\u0005.e\u001ath\tR]\u0012)\fIU&dO[U3\u000e\u000e^N;:C\u001d\noB\"hvthO[U3\u000e\u000e^N;:AG\u0016t.\u0000Z|5+\u001bRHz2C\u001dS\u0000-\u0017~U;:\u000b\u0013@oB\"|~thOKS1??RIz0\u0016G\u0016t?\u000eI_&\u0018\u0003\\T1f\u0017D@#dO[U3\u000e\u000e^N;:AG@.2C\u001dL=-\u0018mU'f\u0017D@#sep{\fhO\u001dU\u0000-\u0017~U;:\u000b\f\u0014,1\u0015\u0011\u001a2'\b{[7<\u0000O\u0014,0\u0017E\u0016t.\u0000Z|5+\u001bRHz1\u0016DCoB\"rlthORn10,RU&,^\u0013Mxh^\u00060\u0010\u0018\\\u001d\u001at>\u0006XM\u001a'\u001dP[8f\u0017\u0011\u001a9>\"\\N&!\u0017f\n\tdOTt;:\u0002\\VoB+m\tthOKS1?!RH9)\u0003\u0013Cxh\u0002Kw5<\u001dTB\u000fy2\u0011\u001a=\u0006\u0000OW5$T7~\u0004{O\u001d\u001a\"!\nJt;:\u0002\\Vz2C\u001dW\"\u0005\u000eIH=04\u000fgxh\u0006sU&%\u000eQ\u0001^\f?\u000e\u001ath\u0001YU $AE\u0016t>\u0006XM\u001a'\u001dP[8dONN5<\n\u0013V=/\u0007Iad\u0015AMU'!\u001bTU:seyjghO\u001dT0'\u001bQ\u0014-dOKS1?!RH9)\u0003\u0011\u001a'<\u000eI_z$\u0006ZR \u0013^`\u0014$'\u001cTN='\u0001\u00060\u0019\t7\u001d\u001at&\u000bRN8dOS^;<\u0003\u0011\u001adsepu\u0002hO\u001dY;$\u0000HHxh\u001cI[ -AQS3 \u001bPU0-\u0003\u0013[9*\u0006XT sep{\u0010hO\u001dY;$\u0000HHxh\u001cI[ -AQS3 \u001bf\n\tf\u000bT\\2=\u001cX\u0016t&\u000bRN8f\u0017EB,dO^U8'\u001aO\u0001^\u0005.y\u001ath\fRV;=\u001d\u0011\u001a'<\u000eI_z$\u0006ZR \u0013^`\u00140!\t[O'-C\u001dT0'\u001bQ\u0014-1\u0016D\u0016t+\u0000QU!:T7w\u0001\u0004O\u001d\u001a;\u000b\u0000QU!:C\u001dS\u0017'\u0003RO&dO^U8'\u001aO\u0001^\f?\t\u001ath\u0000mU'f\u0017\u0011\u001a$\u0005\u000eIH=04\rgxh\u0019T_#\u0018\u0000N\u0001^\f?\t\u001ath\u0000mU'f\u0016\u0011\u001a$\u0005\u000eIH=04\fgxh\u0019T_#\u0018\u0000N\u0001^\f?\t\u001ath\u0000mU'f\u0015\u0011\u001a$\u0005\u000eIH=04\u000fgxh\u0019T_#\u0018\u0000N\u0001^\f?\t\u001ath\u0000mU'f\u0018\u0011\u001a$\u0005\u000eIH=04\u000egxh\u0019T_#\u0018\u0000N\u0001^\u0005 k\u001ath\u0000{U3\u000b\u0000RH0f\u0017\u0011\u001a\"!\nJj;;AG\u0001^\f?\u000e\u001ath\u0000i_,\u000b\u0000RH0xAE\u0016t<\"\\N&!\u0017f\n\tdOTn10,RU&,T7~\u0004{O\u001d\u001a;\u001c\nEy;'\u001dY\nz1C\u001dN\u0019)\u001bOS,\u0013^`\u0016t!;XB\u0017'\u0000O^oB\"rlthORn10,RU&,_\u0013@#dOTn10,RU&,T7\u007f\u001a\fe")), method5626(method5625("N\u001c{\u0006\n\u0019M\u000bzxe|n\u0000\u001a&\u007f\u001at!?RIthO\u001d\u001athO\u001d\u0007t>\nON10AMU'!\u001bTU:se|n\u0000\u001a&\u007f\u001at!,RV;=\u001d\u001d\u001athO\u001d\u0007t>\nON10A^U8'\u001d\u00060\u0015\u001c;os\u0016hOTn10,RU&,O\u001d\u001atuOK_&<\nE\u0014 -\u0017^U;:\u000bf\n\tsero\u0000\u0018:i\u001at'?RIthO\u001d\u001athO\u001d\u0007t:\nNO8<AMU'!\u001bTU:sero\u0000\u0018:i\u001at',RV;=\u001d\u001d\u001athO\u001d\u0007t:\nNO8<A^U8'\u001d\u00060\u001b\u001d;mo\u0000hORn10,RU&,_\u001d\u001atuOO_'=\u0003I\u0014 -\u0017^U;:\u000bf\n\tsero\u0000\u0018:i\u001at';XB\u0017'\u0000O^ehO\u001d\u0007t:\nNO8<AI_,+\u0000RH0\u0013^`\u0001^\u0007:ij\u0001\u001cO\u001dU\u0012'\b~U;:\u000b\u001d\u001athR\u001dH1;\u001aQNz.\u0000ZY;'\u001dY\u0001^\u0018.o{\u0019hO\u001d\\;/?\\H5%\u001c\u001d\u001athR\u001dJ&'\bO[9f\u0003RY5$4\rgoB?|h\u0015\u0005O\u001d\u001a#)\u001bXH\u0004$\u000eS_thO\u0000\u001a$:\u0000ZH5%AQU7)\u0003f\u000b\tsem{\u0006\t\"\u001d\u001at<\"\\N&!\u0017f\u000e\thO\u001d\u0007t3ONN5<\n\u0013W5<\u001dTBz<\nEN!:\nf\n\th\u0012\u00060\u0004\t=|wthOMw5<\u001dTB\u000f|2\u001d\u001atuOF\u001a'<\u000eI_z%\u000eIH=0AMH;\"\n^N='\u0001\u001dGoB?|h\u0015\u0005O\u001d\u001a9>\"\\N&!\u0017f\u000e\thO\u0000\u001a/h\u001cI[ -AP[ :\u0006E\u00149'\u000bXV\"!\nJ\u001a)sei\u007f\u0019\u0018O\u001d\u001at>\u0006XM\u0004'\u001c\u0011\u001a2'\b{[7<\u0000O\u0001^\f?\t\u001ath\u0019T_#\u0018\u0000N\u0014,dOPL\u0019)\u001bOS,\u0013_`\u0016t!?RIoB+m\u000ethOKS1??RIz1C\u001dW\"\u0005\u000eIH=04\fgxh\u0006mU'seyj`hO\u001dL=-\u0018mU'f\u0015\u0011\u001a9>\"\\N&!\u0017f\b\tdOTj;;T7~\u0004|O\u001d\u001a\"!\nJj;;AJ\u0016t%\u0019p[ :\u0006Eag\u0015C\u001dS\u0004'\u001c\u00060\u0007\u001d-\u001d\u001at.\u0000Z|5+\u001bRHz0C\u001d\u0017\"!\nJj;;AG\u0016t.\u0000Zj5:\u000ePIz0T7w\u0001\u0004O\u001d\u001a2'\b{[7<\u0000O\u0014,dO[U3\u000e\u000e^N;:AE\u0016txA\r\neqZ\u000e\u000bf}T7w\u0015\fO\u001d\u001a2'\b{[7<\u0000O\u0014-dOTn10,RU&,AG\u0016t.\u0000Zj5:\u000ePIz2C\u001d\\;/?\\H5%\u001c\u0013MoB<hxthO[U3\u000e\u000e^N;:AG\u0016te\u0019T_#\u0018\u0000N\u0014.dO[U3\u0018\u000eO[9;AD\u0001^\u0005:q\u001ath\tR]\u0012)\fIU&f\u0015\u0011\u001a2'\b{[7<\u0000O\u0014.dO\r\u0014dx\\\u0004\nbzZ\u00060\u0019\u001d#\u001d\u001at.\u0000Z|5+\u001bRHz0C\u001d\\;/)\\Y '\u001d\u0013Bxh\tR]\u0012)\fIU&f\u0016\u00060\u0019\u0001!\u001d\u001at.\u0000Z|5+\u001bRHxh\tR]\u0012)\fIU&dO\f\u0001^\u0005.e\u001ath\tR]\u0012)\fIU&dO[U3\u000e\u000e^N;:C\u001d\noB\"hvthO[U3\u000e\u000e^N;:AG\u0016t.\u0000Z|5+\u001bRHz2C\u001dS\u0000-\u0017~U;:\u000b\u0013@oB\"|~thOKS1??RIz0\u0016G\u0016t?\u000eI_&\u0018\u0003\\T1f\u0017D@#dO[U3\u000e\u000e^N;:AG@.2C\u001dL=-\u0018mU'f\u0017D@#sep{\fhO\u001dU\u0000-\u0017~U;:\u000b\f\u0014,1\u0015\u0011\u001a2'\b{[7<\u0000O\u0014,0\u0017E\u0016t.\u0000Z|5+\u001bRHz1\u0016DCoB\"rlthORn10,RU&,^\u0013Mxh^\u00060\u0019\u00079\u001d\u001at',RV;=\u001d\u0011\u001a=\u000b\u0000QU!:T7~\u0004|O\u001d\u001a;\u0018\u0000N\u0014,dOMw5<\u001dTB\u000fx2\u0011\u001a\"!\nJj;;T7~\u0004|O\u001d\u001a;\u0018\u0000N\u0014-dOMw5<\u001dTB\u000fy2\u0011\u001a\"!\nJj;;T7~\u0004|O\u001d\u001a;\u0018\u0000N\u0014.dOMw5<\u001dTB\u000fz2\u0011\u001a\"!\nJj;;T7~\u0004|O\u001d\u001a;\u0018\u0000N\u0014#dOMw5<\u001dTB\u000f{2\u0011\u001a\"!\nJj;;T7w\u001b\u001eO\u001d\u001a;\u000e\u0000Zy;'\u001dY\u0014,dOKS1??RIz2T7~\u0004{O\u001d\u001a;\u001c\nEy;'\u001dY\nz0C\u001dN\u0019)\u001bOS,\u0013_`\u0016t!;XB\u0017'\u0000O^oB+m\tthORn10,RU&,_\u0013Cxh\u001bp[ :\u0006Eae\u0015C\u001dS\u0000-\u0017~U;:\u000b\u00060\u0019\u00079\u001d\u001at';XB\u0017'\u0000O^df\u0015J\u0016t!;XB\u0017'\u0000O^oB*s~^")), method5626(method5625("\u0006U[zt\u0006SS vG")), method5626(method5625("\u0006U[z\nG")), method5626(method5625("\u0006U[z\u0001G")), method5626(method5625("\u0006U[z\u000fG")), method5626(method5625("\b[")), method5626(method5625("\u0006U[z\u000bG")), method5626(method5625("\u0006U[z\u000eG")), method5626(method5625("\u0006U[z\fG"))};
   @OriginalMember(
      owner = "client!iha",
      name = "u",
      descriptor = "I"
   )
   public static int field11354 = -2;
   @OriginalMember(
      owner = "client!iha",
      name = "t",
      descriptor = "I"
   )
   public static int field11344;
   @OriginalMember(
      owner = "client!iha",
      name = "f",
      descriptor = "I"
   )
   public static int field11345;
   @OriginalMember(
      owner = "client!iha",
      name = "e",
      descriptor = "I"
   )
   public static int field11347;
   @OriginalMember(
      owner = "client!iha",
      name = "m",
      descriptor = "I"
   )
   public static int field11348;
   @OriginalMember(
      owner = "client!iha",
      name = "s",
      descriptor = "I"
   )
   public static int field11350;
   @OriginalMember(
      owner = "client!iha",
      name = "h",
      descriptor = "I"
   )
   public static int field11351;
   @OriginalMember(
      owner = "client!iha",
      name = "i",
      descriptor = "I"
   )
   public static int field11356;
   @OriginalMember(
      owner = "client!iha",
      name = "r",
      descriptor = "I"
   )
   public static int field11359;
   @OriginalMember(
      owner = "client!iha",
      name = "j",
      descriptor = "I"
   )
   public static int field11361;
   @OriginalMember(
      owner = "client!iha",
      name = "v",
      descriptor = "Z"
   )
   private boolean field11343;
   @OriginalMember(
      owner = "client!iha",
      name = "n",
      descriptor = "Z"
   )
   private boolean field11349;

   @OriginalMember(
      owner = "client!iha",
      name = "d",
      descriptor = "(B)V",
      line = 6
   )
   public final void method5622(byte arg0) {
      try {
         ++field11350;
         if (this.field11343) {
            int var2 = super.field6445.method616();
            int var3 = super.field6445.method635();
            float var4 = (float)var2 - (float)(-var3 + var2) * 0.125F;
            float var5 = (float)var2 - (float)(-var3 + var2) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float)super.field6445.field9705, (float)super.field6445.field9663 / 255.0F);
            super.field6445.method4787(-59, 1);
            super.field6445.method4756(super.field6445.field9686, 80);
            super.field6445.method4787(-103, 0);
         }

         if (arg0 <= 33) {
            this.field11355 = true;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field11362[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "c",
      descriptor = "(B)V",
      line = 33
   )
   public final void method1827(byte arg0) {
      try {
         if (this.field11343) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field11343 = false;
         }

         ++field11347;
         super.field6445.method4787(arg0 ^ -61, 1);
         if (arg0 == 77) {
            super.field6445.method4792(-26367, (class799)null);
            super.field6445.method4803(8448, 8448, true);
            super.field6445.method4809(768, (byte)-128, 5890, 0);
            super.field6445.method4809(770, (byte)-128, 34166, 2);
            super.field6445.method4737(arg0 + 44, 0, 770, 5890);
            super.field6445.method4787(-110, 0);
            if (this.field11360) {
               super.field6445.method4809(768, (byte)-128, 5890, 0);
               super.field6445.method4737(arg0 ^ 54, 0, 770, 5890);
               this.field11360 = false;
            }
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11362[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "a",
      descriptor = "(III)V",
      line = 66
   )
   public final void method1833(int arg0, int arg1, int arg2) {
      try {
         if (arg1 <= -90) {
            ++field11344;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field11362[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "a",
      descriptor = "(Lvda;IB)V",
      line = 78
   )
   public final void method1826(class799 arg0, int arg1, byte arg2) {
      try {
         label40: {
            ++field11351;
            if (arg0 == null) {
               if (this.field11360) {
                  break label40;
               }

               super.field6445.method4792(-26367, super.field6445.field9670);
               super.field6445.method4765(1, (byte)-3);
               super.field6445.method4809(768, (byte)-128, 34168, 0);
               super.field6445.method4737(127, 0, 770, 34168);
               this.field11360 = true;
               if (!client.field1786) {
                  break label40;
               }
            }

            if (this.field11360) {
               super.field6445.method4809(768, (byte)-128, 5890, 0);
               super.field6445.method4737(113, 0, 770, 5890);
               this.field11360 = false;
            }

            super.field6445.method4792(-26367, arg0);
            super.field6445.method4765(arg1, (byte)-3);
         }

         if (arg2 > -29) {
            this.method1831(false, -59);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field11362[15] + (arg0 != null ? field11362[4] : field11362[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "a",
      descriptor = "(ZZ)V",
      line = 117
   )
   public final void method1828(boolean arg0, boolean arg1) {
      try {
         ++field11348;
         if (arg0) {
            this.method1830((byte)-89);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11362[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "<init>",
      descriptor = "(Lc;)V",
      line = 130
   )
   public class771(class652 arg0) {
      super(arg0);

      try {
         if (!super.field6445.field9716) {
            this.field11355 = false;
         } else {
            this.field11346 = class659.method4854(field11362[8], super.field6445, -93, 34336);
            this.field11358 = class659.method4854(field11362[7], super.field6445, -60, 34336);
            this.field11352 = class659.method4854(field11362[5], super.field6445, -110, 34336);
            this.field11357 = class659.method4854(field11362[6], super.field6445, -86, 34336);
            if (!(this.field11352 != null & this.field11358 != null & this.field11346 != null & this.field11357 != null)) {
               this.field11355 = false;
            } else {
               this.field11353 = new class396(arg0, 3553, 6406, 2, 1, false, new byte[]{0, -1}, 6406, false);
               this.field11353.method3192(false, false, false);
               this.field11355 = true;
            }
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11362[9] + (arg0 != null ? field11362[4] : field11362[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "a",
      descriptor = "(ZI)V",
      line = 156
   )
   public final void method1831(boolean arg0, int arg1) {
      try {
         ++field11359;
         this.field11349 = arg0;
         if (arg1 != 3211) {
            this.field11358 = null;
         }

         super.field6445.method4787(-81, 1);
         super.field6445.method4792(-26367, this.field11353);
         super.field6445.method4803(34165, 7681, true);
         super.field6445.method4809(768, (byte)-128, 34166, 0);
         super.field6445.method4809(770, (byte)-128, 5890, 2);
         super.field6445.method4737(120, 0, 770, 34168);
         super.field6445.method4787(-126, 0);
         this.method5624((byte)-29);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11362[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "b",
      descriptor = "(B)Z",
      line = 185
   )
   public final boolean method1830(byte arg0) {
      try {
         int var2 = 10 % ((-8 - arg0) / 57);
         ++field11356;
         return this.field11355;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11362[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "a",
      descriptor = "(ILjava/lang/String;B)Lco;",
      line = 195
   )
   public static final class334 method5623(int arg0, String arg1, byte arg2) {
      try {
         ++field11361;

         class334 var3;
         try {
            var3 = (class334)Class.forName(field11362[13]).newInstance();
         } catch (Throwable var5) {
            var3 = new class362();
         }

         if (arg2 > -120) {
            field11354 = -9;
         }

         var3.field5141 = arg0;
         var3.field5144 = arg1;
         return var3;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field11362[14] + arg0 + ',' + (arg1 != null ? field11362[4] : field11362[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "e",
      descriptor = "(B)V",
      line = 216
   )
   public final void method5624(byte arg0) {
      try {
         if (arg0 != -29) {
            this.method1830((byte)113);
         }

         class167 var2;
         label35: {
            ++field11345;
            var2 = super.field6445.field9650;
            if (this.field11349) {
               OpenGL.glBindProgramARB(34336, super.field6445.field9666 == Integer.MAX_VALUE ? this.field11358.field6947 : this.field11357.field6947);
               if (!client.field1786) {
                  break label35;
               }
            }

            OpenGL.glBindProgramARB(34336, super.field6445.field9666 == Integer.MAX_VALUE ? this.field11346.field6947 : this.field11352.field6947);
         }

         var2.method1557(1, (float)super.field6445.field9666, class544.field8180, -1.0F, 0.0F, 0.0F);
         OpenGL.glProgramLocalParameter4fARB(34336, 1, class544.field8180[0], class544.field8180[1], class544.field8180[2], class544.field8180[3]);
         OpenGL.glEnable(34336);
         this.field11343 = true;
         this.method5622((byte)75);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11362[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5625(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 72);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5626(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 111;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 84;
            break;
         default:
            var10005 = 72;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
